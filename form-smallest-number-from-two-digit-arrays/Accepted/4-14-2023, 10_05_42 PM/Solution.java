// https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(h.containsKey(nums1[i])==false)h.put(nums1[i],1);
            else h.put(nums1[i],h.get(nums1[i])+1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(h.containsKey(nums2[i])==false)h.put(nums2[i],1);
            else h.put(nums2[i],h.get(nums2[i])+1);
        }
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            if(e.getValue()>1)return e.getKey();
        }
        if(nums1[0]<nums2[0])return nums1[0]*10+nums2[0];
        else return nums2[0]*10+nums1[0];
    }
}