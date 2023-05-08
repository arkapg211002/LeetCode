// https://leetcode.com/problems/rings-and-rods

class Solution {
    public int countPoints(String rings) {
        int a[]=new int[rings.length()];
        int c=0;int r=0,g=0,b=0;
        for(int i=1;i<rings.length();i+=2)
        {
            r=0;b=0;g=0;
            for(int j=0;j<rings.length()-1;j+=2)
            {
                if(rings.charAt(j+1)==rings.charAt(i))
                {
                    if(rings.charAt(j)=='B')b+=1;
                    else if(rings.charAt(j)=='R')r+=1;
                    else if(rings.charAt(j)=='G')g+=1;
                }
            }
            if(r==1 && g==1 && b==1)
                a[i]=1;
        }
        Arrays.sort(a);
        String s=Arrays.toString(a);
        int f=s.indexOf('1');
        int l=s.indexOf('1');
        c=l-f+1;
        return c;
    }
}