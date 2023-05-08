// https://leetcode.com/problems/smallest-number-in-infinite-set

public class SmallestInfiniteSet {
	int dp[];
	int pointer;
    public SmallestInfiniteSet() {
        dp = new int[1000];
        pointer = 0;
    }
    
    public int popSmallest() {
    	int small = pointer;
        dp[small] = 1;
        while(dp[pointer]==1){
        	pointer++;
        }
        return small+1;
    }
    
    public void addBack(int num) {
        dp[num-1]=0;
        if(pointer>num-1){
        	pointer = num-1;
        }
    }
}