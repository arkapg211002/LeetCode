// https://leetcode.com/problems/3sum

class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        Arrays.sort(n);
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0 ; i<n.length; i++){
            if(i ==0 || n[i] != n[i-1]){
            int j = i+1;
            int k = n.length -1;
            while(j < k){
                sum = n[j] + n[k] +n[i];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    ArrayList<Integer> inside = new ArrayList<>();
                    inside.add(n[i]);
                    inside.add(n[j]);
                    inside.add(n[k]);
                    list.add(inside);

                    while (j < k && n[j] == n[j+1]){
                        j++;
                    }
                    while(j < k && n[k] == n[k-1]){
                     k--;
                    }

                    j++;
                    k--;
                }
            }
            }
        }
        return list;

    }
}