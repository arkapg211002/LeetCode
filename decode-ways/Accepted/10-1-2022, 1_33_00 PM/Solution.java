// https://leetcode.com/problems/decode-ways

class Solution {
    public int numDecodings(String s) {
        return countNumber(0, s, new Integer[s.length()]);
    }
    
    public int countNumber(int idx, String s, Integer[] cache){
        if(idx == s.length()){
            return 1;
        }
        if(cache[idx] != null){
            return cache[idx];
        }
        int count = 0;
        for(int i = idx + 1; i < Math.min(idx + 3, s.length() + 1); i++){
            String sub = s.substring(idx, i);
            int num = Integer.parseInt(sub);
            String nums = String.valueOf(num);
            if(!nums.equals(sub) || num > 26 || num == 0){
                continue;
            }
            count += countNumber(i, s, cache);
        }
        cache[idx] = count;
        return count;
    }
}