// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits

class Solution {
    public int minimumSum(int num) {
        int n=num;
        int a[]=new int[4];
        a[0]=n%10;
        n/=10;
        a[1]=n%10;
        n/=10;
        a[2]=n%10;
        n/=10;
        a[3]=n%10;
        Arrays.sort(a);
        int a1=a[0];
        int b1=a[2];
        int a2=a[1];
        int b2=a[3];
        return ((a1*10+b1)+(a2*10+b2));
    }
}