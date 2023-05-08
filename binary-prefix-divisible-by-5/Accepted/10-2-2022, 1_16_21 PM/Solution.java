// https://leetcode.com/problems/binary-prefix-divisible-by-5

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>l=new ArrayList<>(nums.length);
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if((n=(n*2+nums[i])%5)==0)l.add(true);
            else l.add(false);
        }
        return l;
    }
}
/*
class Solution {
	public List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> result = new ArrayList<>(A.length);
		int s = 0;
		for (int i : A)
			result.add((s = (s * 2 + i) % 5) == 0);

		return result;
	}
}*/