// https://leetcode.com/problems/maximum-number-of-weeks-for-which-you-can-work

class Solution {
    public long numberOfWeeks(int[] milestones) {
        long a[]=Arrays.stream(milestones).mapToLong(i->i).toArray();
        long s=Arrays.stream(a).sum();
        Arrays.sort(a);
        long l=a[a.length-1];
        s-=l;
        return s+=(long)Math.min(s+1,l);
    }
}