// https://leetcode.com/problems/construct-the-rectangle

class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);
        int l=area;
        while(w>1)
        {
            if(area%w==0)
            {
                l=area/w;break;
            }
            w-=1;
        }
        return new int[]{l,w};
    }
}