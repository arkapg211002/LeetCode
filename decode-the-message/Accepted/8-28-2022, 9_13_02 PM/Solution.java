// https://leetcode.com/problems/decode-the-message

class Solution {
    public String decodeMessage(String key, String message) {
        
        key=key.replaceAll(" ","");String sub="";
        for(int i=0;i<key.length();i++)
        {
            sub=key.substring(i+1);
            sub=sub.replaceAll(Character.toString(key.charAt(i)),"");
            key=key.substring(0,i+1)+sub;
            sub="";
        }
        String out="";int k=0;
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            {
                out+=message.charAt(i);
                continue;
            }
            k=key.indexOf(message.charAt(i));
            k+=1;
            k+=96;
            out+=(char)k;
        }
        return out;
        
    }
}