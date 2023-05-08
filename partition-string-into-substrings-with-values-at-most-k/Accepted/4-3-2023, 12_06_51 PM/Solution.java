// https://leetcode.com/problems/partition-string-into-substrings-with-values-at-most-k

class Solution {
    public int minimumPartition(String s, int k) {
        int c=0;
        for(int i=0;i<s.length();)
        {
            System.out.println(i+" "+i);
            StringBuilder nm=new StringBuilder();
            nm.append(s.charAt(i));
            if(nm.length()==1)
            {
                if(nm.charAt(0)-'0'>k)
                {
                    return -1;
                }
                else
                {
                    c++;
                    i++;
                    if(i>=s.length())
                    {
                        break;
                    }
                    nm.append(s.charAt(i));
                    while(Long.parseLong(nm.toString())<=k)
                    {
                        i++;
                        if(i>=s.length())
                        {
                            break;
                        }
                        nm.append(s.charAt(i));
                        System.out.println(nm);
                    }
                    if(i>=s.length())
                    {
                        break;
                    }
                }
            }
        }
        return c;
    }
}