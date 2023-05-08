// https://leetcode.com/problems/find-common-characters

class Solution {
    public List<String> commonChars(String[] words) {
        return Stream.of(words)
                .map(x -> {
                    int[] arr = new int[26];
                    for (char c : x.toCharArray()) arr[c - 97]++;
                    return arr;
                })
                .reduce((x1, x2) -> {
                    for (int i = 0; i < 26; i++) x1[i] = Math.min(x1[i], x2[i]);
                    return x1;
                })
                .map(x -> {
                    List<String> ans = new ArrayList<>();
                    for (int i = 0; i < x.length; i++)
                        for (int j = 0; j < x[i]; j++) ans.add(String.valueOf((char) (i + 97)));
                    return ans;
                }).get();
    }
}