// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int s=Arrays.stream(salary).sum();
        return ((s-salary[0]-salary[salary.length-1])/(salary.length-2));
    }
}