// https://leetcode.com/problems/destroying-asteroids

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int c=0;
        for(int i=0;i<asteroids.length;i++)
        {
            if(mass>=asteroids[i])
            {
                c+=1;
                mass+=asteroids[i];
            }
        }
        if(c==asteroids.length)return true;
        else return false;
    }
}