// https://leetcode.com/problems/minimum-number-of-operations-to-convert-time

class Solution {
    public int convertTime(String current, String correct) {
        String s[]=current.split(":");
        int h1=Integer.valueOf(s[0]);
        int m1=Integer.valueOf(s[1]);
        String st[]=correct.split(":");
        int h2=Integer.valueOf(st[0]);
        int m2=Integer.valueOf(st[1]);
        int hd=h2-h1;
        int md=0;
        if(m1<=m2)md=m2-m1;
        else
        {
            hd-=1;
            md=(60-m1)+m2;
        }
        int c=0;
        int a[]={15,5,1},i=0;
        while(md!=0)
        {
            if(md-a[i]>=0){
                c+=1;
                md=md-a[i];}
            else 
                i+=1;
            
        }
        return (hd+c);
    }
}