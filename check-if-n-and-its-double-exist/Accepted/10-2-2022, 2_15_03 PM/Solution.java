// https://leetcode.com/problems/check-if-n-and-its-double-exist

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target=2*arr[i];
            int start=0;
            int end=arr.length-1;
            while(start<=end ){
                int mid=start+(end-start)/2;
                if(arr[mid]==target&& mid!=i){
                    return true;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            
        }
        return false;
    }
}