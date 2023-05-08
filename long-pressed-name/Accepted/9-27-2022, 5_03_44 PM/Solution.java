// https://leetcode.com/problems/long-pressed-name

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = name.length()-1;
        int j = typed.length()-1;
        if(name.charAt(i) != typed.charAt(j)){
            return false;
        }else{
            i--;
            j--;
        }
        while(i>=0 && j>=0){
            if(name.charAt(i) == typed.charAt(j)){
                i--;
                j--;
            }else if(typed.charAt(j) == typed.charAt(j+1)){
                j--;
            }else{
                return false;
            }
        }
        if(i>=0){
            return false;
        }
        while(j>=0){
            if(typed.charAt(j) == typed.charAt(j+1)){
                j--;
            }else{
                return false;
            }
        }
        return true;
        
    }
}