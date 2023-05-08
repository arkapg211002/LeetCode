// https://leetcode.com/problems/number-of-equivalent-domino-pairs

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dominoes.length;i++)
        {
            if(hm.get(dominoes[i][0]*dominoes[i][1])==null)
            {
                hm.put(dominoes[i][0]*dominoes[i][1],1);
            }
            else hm.put(dominoes[i][0]*dominoes[i][1],hm.get(dominoes[i][0]*dominoes[i][1])+1);
            if(hm.get(dominoes[i][0]*dominoes[i][1])>max)max=hm.get(dominoes[i][0]*dominoes[i][1]);
        }
        return (max*(max-1)/2);      
    }
}