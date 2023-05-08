// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double s=(double)Arrays.stream(salary).sum();
        return ((s-(double)(salary[0]+salary[salary.length-1]))/(double)(salary.length-2));
        
    }
}