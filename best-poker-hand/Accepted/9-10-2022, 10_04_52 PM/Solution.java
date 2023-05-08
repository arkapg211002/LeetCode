// https://leetcode.com/problems/best-poker-hand

class Solution {
	public String bestHand(int[] ranks, char[] suits) {
        Loop:
        while(true){
            for(char c : suits){
                if(c != suits[0]) break Loop;
            }
            return "Flush";
        }
        
        int[] arr = new int[13];
        for(int i : ranks) arr[i-1]++;
        for(int i : arr) if(i >= 3) return "Three of a Kind";
        for(int i : arr) if(i == 2) return "Pair";
        return "High Card";
    }
}