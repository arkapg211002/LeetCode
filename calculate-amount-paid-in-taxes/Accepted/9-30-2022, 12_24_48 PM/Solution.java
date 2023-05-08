// https://leetcode.com/problems/calculate-amount-paid-in-taxes

class Solution {
     public double calculateTax(int[][] brackets, int income) {
       if(income == 0) return (double)0;
       double tax = 0;
       for(int i = 0; i < brackets.length; i++){
           double tempTax = 0;
           int incomeQualified = 0;

           if( i == 0 && income >= brackets[i][0]){
                   tempTax = (double) (brackets[i][0]) * (brackets[i][1]) / 100;
                   incomeQualified  += brackets[i][0];
           }else if( i > 0 && income >= brackets[i][0] - brackets[i - 1][0]){
              if(i > 0) {
                   tempTax = (double) (brackets[i][0] - brackets[i - 1][0]) * (brackets[i][1]) / 100;
                   incomeQualified += brackets[i][0] - brackets[i - 1][0];
               }
           }else if(income > 0){
                   tempTax = (double) (income * brackets[i][1]) / 100;
                   incomeQualified += income;
           }
           income -= incomeQualified;
           tax += tempTax;
       }
       return tax;
   }
}