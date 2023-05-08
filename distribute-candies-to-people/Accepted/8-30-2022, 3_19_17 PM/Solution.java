// https://leetcode.com/problems/distribute-candies-to-people

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        
        int ans[] = new int[num_people];
        
        int i=0,j=1;    // i for array traversal, j for candies   
        while(candies>0){
            if(i>=num_people){
                // if i reaches array size limit, go to zeroth index again
                i=0;
            }
            if(candies>=j){
            ans[i]+=j;
            candies-=j;
            i++;j++;    
            }
            else{
                ans[i++]+= candies;
                candies=0;
            }
        }
        
        return ans;
        
    }
}