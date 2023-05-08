// https://leetcode.com/problems/thousand-separator

class Solution {
    public String thousandSeparator(int n) {
        StringBuilder ans = new StringBuilder();
        int i =1;
        if(n==0) return "0";
        while(n>0){
            ans.append(String.valueOf(n%10));
            n /= 10;
            if(i%3 == 0 && n>0)
                ans.append(".");
            i+=1;
        }
        return String.valueOf(ans.reverse());
    }
}