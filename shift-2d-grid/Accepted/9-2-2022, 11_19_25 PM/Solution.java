// https://leetcode.com/problems/shift-2d-grid

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int arr[] = new int[m*n];
        int ans[] = new int[m*n];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[index]=grid[i][j];
                index++;
            }
        }
        for(int i=0;i<m*n;i++){
            int t=(i+k)%arr.length;
            ans[t]=arr[i];
        }
        List<List<Integer>> list = new ArrayList<>();
        int count=0;
        for(int i=0;i<ans.length;i=i+n){
            List<Integer> temp = new ArrayList<>();
            for(int j=i;j<i+n;j++)
                temp.add(ans[j]);
            list.add(temp);
        }
        return list;
    }
}