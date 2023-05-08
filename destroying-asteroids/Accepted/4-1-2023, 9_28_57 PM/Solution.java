// https://leetcode.com/problems/destroying-asteroids

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int c=0;
        long s=(long)mass;
        for(int i=0;i<asteroids.length;i++)
        {
            long d=(long)asteroids[i];
            if(s>=d)
            {
                c+=1;
                s+=d;
            }
            //else System.out.println(d);
        }
        //System.out.println(s+" "+c);
        if(c==asteroids.length)return true;
        else return false;
    }
}