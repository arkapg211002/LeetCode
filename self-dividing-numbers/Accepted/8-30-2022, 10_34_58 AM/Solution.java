// https://leetcode.com/problems/self-dividing-numbers

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>l=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int j=i,flag=1;
            String s=Integer.toString(j);
            if(s.contains("0")==true)continue;
            String str[]=s.split("");
            for(int k=0;k<str.length;k++)
            {
                if(i%(Integer.valueOf(str[k]))!=0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)l.add(i);
            
        }
        return l;
    }
}