// https://leetcode.com/problems/keyboard-row

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> temp= new ArrayList();
        String st[]= {"qwertyuiop","asdfghjkl","zxcvbnm"};
        for(String x: words){
            for(int i=0;i<3;i++){
                 if(st[i].indexOf(x.toLowerCase().charAt(0))>=0){
                     if(is(x.toLowerCase(),st[i]))temp.add(x);
                 }
                     
            }
            
            }
        String res[]= new String[temp.size()];
            int in=0;
            for(String t:temp){
                res[in]=t;
                in++;
           
        }
        return res;
    }
    
    public boolean is(String s,String x){
        for(char c:s.toCharArray()){
            if(x.indexOf(c)<0)return false;
        }
        return true;
    }
}