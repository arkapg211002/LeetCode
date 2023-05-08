// https://leetcode.com/problems/sort-even-and-odd-indices-independently

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer>e=new ArrayList<>();
        List<Integer>od=new ArrayList<>();
        int i,j;
        for(i=0;i<nums.length;i+=2)
        {
            e.add(nums[i]);
            
        }
        for(j=1;j<nums.length;j+=2)
        {
            od.add(nums[j]);
            
        }
        Collections.sort(e);
        Collections.sort(od);
        Collections.reverse(od);
        //System.out.println(e);
        //System.out.println(od);
        int a[]=new int[nums.length];
        int k=0,m=0;
        for(i=0;i<nums.length;i+=2)
        {
            a[i]=e.get(k);k+=1;
        }
        for(j=1;j<nums.length;j+=2)
        {
            a[j]=od.get(m);m+=1;
        }
        return a;
    }
}