// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        List<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < s1.length(); i ++){
            if(s1.charAt(i) != s2.charAt(i)){
                indexes.add(i);
            }
        }
        if(indexes.size() > 2 || indexes.size() == 1)
            return false;
        if(s1.charAt(indexes.get(0)) == s2.charAt(indexes.get(1)) && s1.charAt(indexes.get(1)) == s2.charAt(indexes.get(0)))
            return true;
        return false;
    }
}