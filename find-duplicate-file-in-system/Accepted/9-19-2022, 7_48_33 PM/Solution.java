// https://leetcode.com/problems/find-duplicate-file-in-system

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> fileContentToPath = new HashMap<>();

        for (String path : paths) {
            String[] pathParts = path.split(" "); String filePath = pathParts[0];

            for (int i = 1; i < pathParts.length; ++i) {
                String fileAndContent = pathParts[i];
                String content = fileAndContent.substring(fileAndContent.indexOf("(") + 1, fileAndContent.indexOf(")"));
                String fileName = fileAndContent.substring(0, fileAndContent.indexOf("("));

                fileContentToPath.computeIfAbsent(content, param -> new ArrayList<>()).add(filePath + "/" + fileName);
            }
        }

        return fileContentToPath.values().stream().filter(value -> value.size() > 1).toList();
    }
}