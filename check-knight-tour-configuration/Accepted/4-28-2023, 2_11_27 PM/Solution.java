// https://leetcode.com/problems/check-knight-tour-configuration

class Solution {
    static void isValid(int grid[][],boolean visited[][],int v1,int v2,int move,int r,int c){
        if(v1<0 || v2<0 ||v1>=r || v2>=c)return;
        if(!visited[v1][v2]&& grid[v1][v2]==move ){
            visited[v1][v2]=true;
            isValid(grid,visited,v1+1,v2+2,move+1,r,c);
            isValid(grid,visited,v1+1,v2-2,move+1,r,c);
            isValid(grid,visited,v1-1,v2+2,move+1,r,c);
            isValid(grid,visited,v1-1,v2-2,move+1,r,c);
            
            isValid(grid,visited,v1+2,v2+1,move+1,r,c);
            isValid(grid,visited,v1-2,v2+1,move+1,r,c);
            isValid(grid,visited,v1+2,v2-1,move+1,r,c);
            isValid(grid,visited,v1-2,v2-1,move+1,r,c);
        }
        }
        
    
    public boolean checkValidGrid(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        boolean visited[][]=new boolean[r][c];
        isValid(grid,visited,0,0,0,r,c);
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(!visited[i][j])return false;
        
        return true;
    }
}