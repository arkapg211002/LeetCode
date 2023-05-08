// https://leetcode.com/problems/fair-candy-swap

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0, sumB=0;
        sumA=Arrays.stream(A).sum();
        sumB=Arrays.stream(B).sum();        
        for(int a=0; a<A.length; a++){
            for(int b=0; b<B.length; b++){
                if(sumA-A[a]+B[b] == sumB-B[b]+A[a]){
                   int[] arr = {A[a],B[b]}; 
                   return arr; 
                }
            }
        }    

        return A;
    }
}