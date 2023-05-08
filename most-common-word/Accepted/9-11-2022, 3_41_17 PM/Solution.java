// https://leetcode.com/problems/most-common-word

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] words = str.split("\\s+");
        Set<String> set = new HashSet<>();
        for (String word: banned)
            set.add(word);
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : words) {
            if (!set.contains(word))
                map.put(word,map.getOrDefault(word,0)+1);
        }
        int max=-1;
        String ans = "";
        for(Map.Entry m: map.entrySet()){
            int num = (int)m.getValue();
            if(num>max){
                max=num;
                ans=(String)m.getKey();
            }
        }
        return ans;
    }
}