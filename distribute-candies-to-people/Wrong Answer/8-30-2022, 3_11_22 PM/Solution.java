// https://leetcode.com/problems/distribute-candies-to-people

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int a[]=new int[num_people];
        int s=0;
        int c=1;
        int i=0;
        while(s<candies)
        {
            if(s+c>=candies)break;
            a[i]+=c;
            c+=1;
            s+=a[i];
            i+=1;
            if(i==num_people)i=0;
        }
        int r=candies-s;
        a[num_people-1]+=r;
        return a;
    }
}