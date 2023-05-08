// https://leetcode.com/problems/append-k-integers-with-minimal-sum

class Solution {
    public long minimalKSum(int[] nums, int k) {
        long n[]=Arrays.stream(nums).mapToLong(i->i).toArray();
        List<Long>l=new ArrayList<>();
        for(int i=0;i<n.length;i++)
            l.add(n[i]);
        long s=Arrays.stream(n).sum();
        long r=s;
        long d=1;
        while(k>0)
        {
            if(l.contains(d)==false)
            {
                s+=d;
                d+=1;
                k-=1;
            }
            else
            {
                d+=1;
            }
        }
        return s-r;
    }
}