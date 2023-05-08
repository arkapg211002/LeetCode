// https://leetcode.com/problems/unique-morse-code-words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        List<String>l=new ArrayList<>();
        l.add(".-");
        l.add("-...");
        l.add("-.-.");
        l.add("-..");
        l.add(".");
        l.add("..-.");
        l.add("--.");
        l.add("....");
        l.add("..");
        l.add(".---");
        l.add("-.-");
        l.add(".-..");
        l.add("--");
        l.add("-.");
        l.add("---");
        l.add(".--.");
        l.add("--.-");
        l.add(".-.");
        l.add("...");
        l.add("-");
        l.add("..-");
        l.add("...-");
        l.add(".--");
        l.add("-..-");
        l.add("-.--");
        l.add("--..");
        
        
        
        char ch='\u0000';String s="";
        List<String> a=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                ch=words[i].charAt(j);
                s+=l.get((int)ch-97);
            }
            a.add(s);
            s="";
        }
        //System.out.println(a);
        int c=0;
        for(int i=0;i<a.size();i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
                
                if(a.get(i).equals(a.get(j))==true)
                {
                    c+=1;
                    a.remove(j);
                    break;
                }
            }
        }
        return c;
        
    }
}