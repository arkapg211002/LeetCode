// https://leetcode.com/problems/occurrences-after-bigram

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String st[]=text.split(" ");
        List<String>l=new ArrayList<>();
        for(int i=0;i<st.length-2;i++)
        {
            if(st[i].equals(first)==true && st[i+1].equals(second)==true && i+2!=st.length)l.add(st[i+2]);
        }
        return l.toArray(new String[0]);
    }
}