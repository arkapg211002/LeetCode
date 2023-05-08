// https://leetcode.com/problems/subsets

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //to make all duplicates together
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        //call the subset creation method
        subsetCreation(0, nums, res, list);
        //return;
        return res;
    }
    public void subsetCreation(int index, int[] arr, List<List<Integer>> res, List<Integer> list){
        res.add(new ArrayList<>(list));
        for(int i = index;i < arr.length;i++){
            //if we are running this loop for first time in any recursion level we can add the element
            //otherwise check whether the element is duplicate or not 
            //if duplicate dont add it just continue
            if(i != index && arr[i] == arr[i - 1]) continue;
            //here i != index is the check for whether it is the first time loop is executing in a recursion level or not if not equal means it is not first time
            list.add(arr[i]);
            subsetCreation(i + 1, arr, res, list);
            list.remove(list.size() - 1);
        }
    }
}