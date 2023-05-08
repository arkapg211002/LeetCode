// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int i=k,c=0,idl=0,idr=0;
        while(i<=blocks.length())
        {
            String sub=blocks.substring(i-k,i);
            //System.out.println(sub);
            char ch[]=sub.toCharArray();
            Arrays.sort(ch);
            sub=new String(ch);
            //System.out.println(sub);
            idl=sub.indexOf('W');
            idr=sub.lastIndexOf('W');
            if(idl==-1 && idr==-1)c=0;
            else c=idr-idl+1;
            //System.out.println(idl+" "+idr+" "+c);
            if(c<min)
                min=c;
            i+=1;
        }
        return min;
    }
}