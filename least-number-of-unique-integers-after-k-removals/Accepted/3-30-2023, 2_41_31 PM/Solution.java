// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        int a =0;
        int max = arr[arr.length-1];
        for(int i =arr.length-1 ; i>=0 ; i--){
            if(arr[i]==max) a++;
            else break;
        }
        ArrayList <Integer> ls = new ArrayList<>();
        HashSet <Integer> hs = new HashSet<>();
        int c =0;
        for (int i = 0; i <arr.length ; i++) {
            int len = hs.size();
            hs.add(arr[i]);
            if(hs.size()==len) {
                c++;
            }
            else{
                ls.add(c+1);
                c=0;
            }
        }
        ls.add(a);
        ls.remove(0);
        Collections.sort(ls);
        int count =k , ans=0;
        for (int i = 0; i <ls.size() ; i++) {
            if(ls.get(i)-count<=0){
                count -= ls.get(i);
                ans++;
            }
            else{
                break;
            }
        }
        return ls.size()-ans;
    }
}