// https://leetcode.com/problems/split-with-minimum-sum

class Solution {
    public int splitNum(int num) {
        char arr[] = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        String n1 = "", n2 = "";
        for(int i=0; i<arr.length; i+=2){
            if(i<arr.length)    n1 += arr[i]+"";
            if(i+1<arr.length)  n2 += arr[i+1]+"";
        }
        return Integer.parseInt(n1)+Integer.parseInt(n2);
    }
}