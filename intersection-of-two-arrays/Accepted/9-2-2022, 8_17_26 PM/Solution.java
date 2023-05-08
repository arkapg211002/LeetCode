// https://leetcode.com/problems/intersection-of-two-arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int c=0;
        for(int i=0;i<nums1.length;i++)
        {
            c=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])c+=1;
            }
            hm.put(nums1[i],c);
            
        }
        //System.out.println(hm);
        ArrayList<Integer>a=new ArrayList<>();int k=0;
            for(Map.Entry<Integer,Integer>e:hm.entrySet())
            {
                if(e.getValue()!=0)
                {
                    a.add(e.getKey());
                }
            }
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)b[i]=a.get(i);
            return b;
    }
}