// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side

class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;  
        int ger=arr[n-1]; //gretest element at right            
        arr[n-1]=-1;
        
        for(int i=n-2;i>=0;i--) {
            int temp=arr[i];
            arr[i]=ger;
            ger= Math.max(temp,ger);
        }
        return arr;
    }
}