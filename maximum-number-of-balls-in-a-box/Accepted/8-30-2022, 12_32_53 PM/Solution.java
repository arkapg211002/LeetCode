// https://leetcode.com/problems/maximum-number-of-balls-in-a-box

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int max=Integer.MIN_VALUE;
        List<Integer>l=new ArrayList<>();
        
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int s=0,j=i;
            while(j>0)
            {
                s+=j%10;
                j/=10;
            }
            l.add(s);
            if(s>=max)max=s;
            
        }
        //System.out.println(max);
        //System.out.println(l);
        int a[]=new int[max+1];
        a[0]=0;
        for(int i=0;i<l.size();i++)
        {
            a[l.get(i)]+=1;
        }
        Arrays.sort(a);
        return a[a.length-1];
        
    }
}