// https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix

class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum)
    {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        
        for(int i:colsum)
        {
            if(i==2)
            {
                ans.get(0).add(1);
                ans.get(1).add(1);
                upper--;
                lower--;
            }
            
            else if(i==0)
            {
                ans.get(0).add(0);
                ans.get(1).add(0);
            }
            
            else if(i==1)
            {
                if(upper>=lower)
                {
                    ans.get(0).add(1);
                    ans.get(1).add(0);
                    upper--;
                }
                else
                {
                    ans.get(0).add(0);
                    ans.get(1).add(1);
                    lower--;
                }
            }
        }
        
        if(upper!=0 || lower!=0)
        {
            return new ArrayList<>();
        }
        
        return ans;
    }
}