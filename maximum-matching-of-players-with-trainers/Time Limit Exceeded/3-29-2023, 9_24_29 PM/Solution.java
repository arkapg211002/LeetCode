// https://leetcode.com/problems/maximum-matching-of-players-with-trainers

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int c=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        for(int i=0;i<players.length;i++)
        {
            for(int j=0;j<trainers.length;j++)
            {
                if(players[i]<=trainers[j])
                {
                    trainers[j]=0;
                    c+=1;
                    break;
                }
            }
        }
        return c;
    }
}