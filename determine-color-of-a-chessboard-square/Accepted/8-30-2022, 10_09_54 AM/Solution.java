// https://leetcode.com/problems/determine-color-of-a-chessboard-square

class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        int c=(int)a-96;
        char b=coordinates.charAt(1);
        int r=Integer.valueOf(Character.toString(b));
        boolean re=true;
        if(c%2==0)
        {
            re=true;
            for(int i=1;i<r;i++)
            {
                if(re==true)re=false;
                else re=true;
            }    
            
        }
        else
        {
            re=false;
            for(int i=1;i<r;i++)
            {
                if(re==true)re=false;
                else re=true;
            }    
        }
        return re;
    }
}