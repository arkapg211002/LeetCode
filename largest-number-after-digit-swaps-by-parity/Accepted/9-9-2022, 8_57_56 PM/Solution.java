// https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity

class Solution {
    public int largestInteger(int n) {
        List<Integer>e=new ArrayList<>();
        List<Integer>o=new ArrayList<>();
        List<Integer>num=new ArrayList<>();
        while(n>0)
        {
            num.add(n%10);
            if((n%10)%2==0)e.add(n%10);
            else o.add(n%10);
            n/=10;
        }
        Collections.reverse(num);
        Collections.sort(e);
        Collections.reverse(e);
        Collections.sort(o);
        Collections.reverse(o);
        int eve=0,odd=0,s=0;
        for(int i=0;i<num.size();i++)
        {
            if(num.get(i)%2==0)
            {
                s=(s*10)+e.get(eve);
                eve+=1;
            }
            else 
            {
                s=(s*10)+o.get(odd);
                odd+=1;
            }
        }
        return s;
    }
}