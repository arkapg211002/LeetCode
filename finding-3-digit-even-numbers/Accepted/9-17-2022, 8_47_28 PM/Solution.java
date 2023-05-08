// https://leetcode.com/problems/finding-3-digit-even-numbers

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        HashSet<Integer>l=new HashSet<>();
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]==0)continue;
            for(int j=0;j<digits.length;j++)
            {
                for(int k=0;i<digits.length;k++)
                {
                    if(k==digits.length)break;
                    if(i==j || i==k || j==k)continue;
                    int num=(digits[i]*100)+(digits[j]*10)+digits[k];
                    if(num%2==0)l.add(num);
                }
            }
        }
        List<Integer>li=new ArrayList<>(l);
        Collections.sort(li);
        int a[]=new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            a[i]=li.get(i);
        }
        return a;
    }
}