// https://leetcode.com/problems/subsets

public class Solution {
    public List<List<int>> Subsets(int[] nums) {
        List<List<int>> subsets = new List<List<int>>();
        subsets.Add(new List<int>()); 

        for(int i=0; i<nums.Length; i++)
        {
            int count = subsets.Count;
            for(int j=0; j<count; j++)
            {
                var temp = subsets[j].ToList();
                temp.Add(nums[i]);
                subsets.Add(temp);

            }
        }
        return subsets;
    }
}