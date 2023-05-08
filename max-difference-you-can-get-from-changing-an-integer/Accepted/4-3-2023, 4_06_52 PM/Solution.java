// https://leetcode.com/problems/max-difference-you-can-get-from-changing-an-integer

class Solution {
    public int maxDiff(int num) {
        int res = 0;
        String digits = "" + num;
        char[] chars = digits.toCharArray();
        char c = '0';
        int i = 0;
        while(i < chars.length){
            if(chars[i] != '9'){
                c = chars[i];
                break;
            }
            i++;
        }
        if(i < chars.length)
            for(i = 0; i < chars.length; i++){
                if(chars[i] == c)
                    chars[i] = '9';
            }
        
        String str = new String(chars);
        int bigNum = Integer.parseInt(str);
        chars = digits.toCharArray();
        i = 0;
        String temp = digits;
        if(chars[0] != '1'){
            c = chars[0];
            temp  = temp.replace(c, '1');
        }else{
            while(i < chars.length && (chars[i] == '1' || chars[i] == '0')){
                 i++;
            }
            if(i < chars.length){
                c = chars[i];
                temp  = temp.replace(c, '0');
            }
        }
        int smallNum = Integer.parseInt(temp);
        
        return bigNum - smallNum;
        
    }
}