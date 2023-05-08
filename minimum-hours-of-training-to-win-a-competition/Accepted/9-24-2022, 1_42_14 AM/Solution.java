// https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int ene = initialEnergy;
        int exp = initialExperience;
        int res=0,diff=0;
        for (int i=0;i<energy.length;i++) {
            if (energy[i]>=ene) {   
                diff = energy[i]-ene+1;
                res = res+diff;
                ene = ene+diff;
            }
            ene = ene-energy[i];
            if (experience[i]>=exp) {
                diff = experience[i]-exp+1;
                res = res+diff;
                exp = exp+diff;
            }
            exp = exp+experience[i];
        }
        return res;
    }
}