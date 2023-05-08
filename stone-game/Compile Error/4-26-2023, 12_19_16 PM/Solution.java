// https://leetcode.com/problems/stone-game

int n;
    int dp[][];

    public boolean stoneGame(int[] piles) {
        n = piles.length;
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        stoneGameHelper(0, piles, 0, piles.length - 1);

        return dp[0][n - 1] > 0;
    }

    private int stoneGameHelper(int playerToPlay, int[] piles, int start, int end) {
        if (start > end) {  // Base case for bounds
            return 0;
        }

        if (start == end) {  // only remaining pile
            return piles[start];
        }

        if (dp[start][end] != -1) return dp[start][end]; // Already computed window

        int stones;
        if (playerToPlay == 0) { // '0' is Alex
            stones = Math.max(piles[start] + stoneGameHelper(1, piles, start + 1, end),
                    piles[end] + stoneGameHelper(1, piles, start, end - 1));
        } else { // Lee plays and deducts our points, since its optimal play we take the most negative value
            stones = Math.min(-piles[start] + stoneGameHelper(0, piles, start + 1, end),
                    -piles[end] + stoneGameHelper(0, piles, start, end - 1));
        }
        dp[start][end] = stones;
        return stones;
    }