// https://leetcode.com/problems/binary-gap

class Solution {
    public int binaryGap(int n) {
        if(n==0)return 0;
        if(n==1)return 1;        
        List<Integer>l=new ArrayList<>();
        long i=1;int c=0;
        while(i<=n)
        {
            if((n&(1<<c))!=0)l.add(c+1);
            i<<=1;c+=1;
        }
        int max=Integer.MIN_VALUE;
        //System.out.println(l);
        for(int j=0;j<l.size()-1;j++)
        {
            //if(l.get(j+1)-l.get(j)>=max)max=l.get(j+1)-l.get(j);
            max=(int)Math.max(max,(l.get(j+1)-l.get(j)));
        }
        return max;
    }
}