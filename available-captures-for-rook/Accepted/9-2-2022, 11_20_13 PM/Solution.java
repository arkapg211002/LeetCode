// https://leetcode.com/problems/available-captures-for-rook

class Solution {
    public int numRookCaptures(char[][] board) {
        // Initialize & Find the rook coordinates
        int x = -1, y = -1;
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                if(board[i][j] == 'R'){
                    x=i;
                    y=j;
                }
        
        // Available capture count
        int cnt = 0;
        
        // Search West
        int i = x, j = y-1;
        while(j >= 0 && board[i][j] == '.')
            j--;
        if(j >= 0 && board[i][j] == 'p')
            cnt++;
        
        // Search East
        i = x; j = y+1;
        while(j < board[0].length && board[i][j] == '.')
            j++;
        if(j < board[0].length && board[i][j] == 'p')
            cnt++;
        
        // Search South
        i = x-1; j = y;
        while(i >= 0 && board[i][j] == '.')
            i--;
        if(i >= 0 && board[i][j] == 'p')
            cnt++;
        
        // Search North
        i = x+1; j = y;
        while(i < board.length && board[i][j] == '.')
            i++;
        if(i < board.length && board[i][j] == 'p')
            cnt++;
        
        // Return count of available attacks
        return cnt;
    }
}