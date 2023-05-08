// https://leetcode.com/problems/as-far-from-land-as-possible

class Solution
{
    public int maxDistance(int[][] grid) 
    {
        int n = grid.length;
        int ans = -1;
        int dist = 0;
        Queue<int[]> qu = new LinkedList<>();
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    qu.add(new int[]{i, j});}
            }
        }
        while(!qu.isEmpty())
        {
            dist++;
            for(int x = qu.size(); x > 0; x--)
            {
                int[] a = qu.remove();
                for(int[] ar : dir)
                {
                    int i = ar[0] + a[0], j = ar[1] + a[1];
                    if(i >= 0 && j >= 0 && i < n && j < n && grid[i][j] == 0)
                    {
                        ans = dist;
                        grid[i][j] = ans;
                        qu.add(new int[]{i, j});
                    }
                }
            }
        }
        return ans;
    }
}