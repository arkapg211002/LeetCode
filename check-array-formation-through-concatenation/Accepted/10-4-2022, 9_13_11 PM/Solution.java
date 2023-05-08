// https://leetcode.com/problems/check-array-formation-through-concatenation

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
         Map<Integer, Integer> positionMap = new HashMap<>();
		//Store positions of all the elements of arr
        for(int i = 0; i < arr.length; i++)
            positionMap.put(arr[i], i);

        for(int[] piece: pieces){
			//First element does not have any position in original arr
            if(!positionMap.containsKey(piece[0])) return false;
            for(int i = 1; i < piece.length; i++) {
				//Whether element exists in original arr and appears next to the previous element
                if(!positionMap.containsKey(piece[i])) return false;
                if(positionMap.get(piece[i]) - positionMap.get(piece[i-1]) != 1) return false;
            }
        }

        return true;
    }
}