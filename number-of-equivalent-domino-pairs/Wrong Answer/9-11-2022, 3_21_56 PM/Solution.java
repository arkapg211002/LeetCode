// https://leetcode.com/problems/number-of-equivalent-domino-pairs

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int c=0;
        for(int i=0;i<dominoes.length;i++)
        {
            if(hm.get(dominoes[i][0]*dominoes[i][1])==null)
            {
                hm.put(dominoes[i][0]*dominoes[i][1],1);
            }
            else hm.put(dominoes[i][0]*dominoes[i][1],hm.get(dominoes[i][0]*dominoes[i][1])+1);
            
        }
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            int k=e.getValue();
            if(k>1)c+=(k*(k-1)/2);
        }
        return c;
    }
}