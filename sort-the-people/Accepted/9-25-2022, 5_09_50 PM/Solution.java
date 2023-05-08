// https://leetcode.com/problems/sort-the-people

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         HashMap<Integer,String>hm=new HashMap<>();
         for(int i=0;i<heights.length;i++)
         {
             hm.put(heights[i],names[i]);
         }
        //System.out.println(hm);
         Arrays.sort(heights);
        String a[]=new String[names.length];
        int k=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            a[k]=hm.get(heights[i]);
            k+=1;
        }
        return a;
    }
}