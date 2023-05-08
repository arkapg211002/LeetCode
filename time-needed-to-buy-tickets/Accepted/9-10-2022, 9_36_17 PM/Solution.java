// https://leetcode.com/problems/time-needed-to-buy-tickets

class Solution {
public int timeRequiredToBuy(int[] tickets, int k) {

    int sum=0;
    
    for(int i=0; i<tickets.length; i++)
    {
        if(i<=k){
            sum += Math.min(tickets[k] ,tickets[i]);
        }
        else{
            sum += Math.min(tickets[i], tickets[k]-1);
        }
    }
    
    return sum;
}
}