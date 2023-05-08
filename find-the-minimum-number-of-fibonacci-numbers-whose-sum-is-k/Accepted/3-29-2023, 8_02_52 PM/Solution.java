// https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k

class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer>l=new ArrayList<>();
        int a=1,b=1,c=2;
        l.add(a);l.add(b);l.add(c);
        while(c<=k)
        {
            a=b;
            b=c;
            c=a+b;
            l.add(c);
        }
        //k-=l.get(l.size()-2);
        int n=0;
        while(k!=0)
        {
            if(l.contains(k)==true)
            {
                k=0;
                n+=1;
            }
            else
            {
                int d=0;
                for(int i=0;i<l.size();i++)
                {
                    if(l.get(i)>k)
                    {
                        d=i-1;
                        break;
                    }
                }
                k-=l.get(d);
                n+=1;
            }
        }
        return n;
    }
}