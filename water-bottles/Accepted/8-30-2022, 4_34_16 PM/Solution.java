// https://leetcode.com/problems/water-bottles

class Solution {
     public int numWaterBottles(int bottles, int exchange) {
        int sum = 0,empty = 0;
        while(bottles + empty  >= exchange)
        {
            sum += bottles;
			empty += bottles; 
			bottles = empty / exchange;
			empty =   empty % exchange;   
        }
        if(bottles > 0)
            sum += bottles;
        return sum;
    }
}