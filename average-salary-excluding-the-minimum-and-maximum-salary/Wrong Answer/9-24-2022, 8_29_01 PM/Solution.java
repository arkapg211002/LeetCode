// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        return ((salary[0]+salary[salary.length-1])/2);
    }
}