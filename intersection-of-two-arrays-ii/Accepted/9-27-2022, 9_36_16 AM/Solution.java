// https://leetcode.com/problems/intersection-of-two-arrays-ii

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList al = new ArrayList();
    
    for(int i=0;i<nums1.length;i++)
    {
        for(int j=0;j<nums2.length;j++)
        {
            if(nums1[i]==nums2[j])
            {
                al.add(nums1[i]);
                nums2[j]=-1;
                break;
            }
        }
    }
    
    int r[] = new int[al.size()];
    for(int i=0;i< al.size();i++)
    { 
        r[i] = Integer.parseInt((al.get(i)).toString());
    }
    return r;
    }
}