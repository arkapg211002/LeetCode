// https://leetcode.com/problems/maximum-score-from-removing-substrings

public int maximumGain(String s, int x, int y) {
    if(x<y)
    {
      StringBuilder sb=new StringBuilder(s);
      s=sb.reverse().toString();
      int temp=x;// making "ab" with the greater gain 
      x=y;
      y=temp;
    }
    // x is always greater than y so trying to make as much possible "ab", then make "ba" from remaining a's and b's
    int ans=0,a=0,b=0;
    for(char ch:s.toCharArray())
    {
        if(ch=='a')
        {
            a++;
        }
        else if(ch=='b')
        {
            if(a!=0)// trying to make "ab" as it has greater value
            {
                ans+=x;
                a--;
            }
            else
                b++;
        }
        else // if character other than a and b comes
        {
            ans+=Math.min(a,b)*y; // add ocurrences of "ba"
            a=0;b=0;
        }
    }
    return ans+Math.min(a,b)*y;// add ocurrences of "ba"
}