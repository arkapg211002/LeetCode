// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> cells=new ArrayList<>();
        String str[]=s.split(":");
        String a=str[0];
        String b=str[1];
        String a1[]=a.split("");
        String b1[]=b.split("");
        int c1=(int)a1[0].charAt(0);
        int c2=(int)b1[0].charAt(0);
        int c=c2-c1+1;
        int r1=Integer.parseInt(a1[1]);
        int r2=Integer.parseInt(b1[1]);
        int r=r2-r1+1;
        int m[][]=new int[r][c];
        String sb="";
        for(int i=c1;i<=c2;i++)
        {
            for(int j=r1;j<=r2;j++)
            {
                sb=(char)i+Integer.toString(j);
                cells.add(sb);
                sb="";
            }
        }
        return cells;
    }
}