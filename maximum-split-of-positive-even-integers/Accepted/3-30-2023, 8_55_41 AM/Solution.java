// https://leetcode.com/problems/maximum-split-of-positive-even-integers

class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum%2!=0)return new ArrayList<Long>();
        long k=2;
        List<Long>l=new ArrayList<>();
        while(finalSum>0)
        {
            if(finalSum<k)
            {
                long d=l.get(l.size()-1);
                l.set((l.size()-1),d+finalSum);
                break;
            }
            finalSum-=k;
            l.add(k);
            k+=2;
        }
        System.out.println(l);
        return l;
    }
}