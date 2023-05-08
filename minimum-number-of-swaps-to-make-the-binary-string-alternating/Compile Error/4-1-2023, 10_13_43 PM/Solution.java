// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-binary-string-alternating

public int minSwaps(String s) {
        int one=0,zero=0;
        for(char ch : s.toCharArray()){
            if(ch == '1')   one++;
            else zero++;
        }
        if(Math.abs(one-zero) > 1)
            return -1;
        //if no of 1 is more then, all ones should be placed at even positions,
        //if it's not present at even position then we need a swap. vice-versa for 0
        if(one > zero)
            return checkSwaps(s.toCharArray(),'1');
        else if(zero > one)
            return checkSwaps(s.toCharArray(),'0');
        //if both are having same count then either can be placed at even/odd position
        //so take minimum of both possibilities
        else
            return Math.min(checkSwaps(s.toCharArray(),'1'),checkSwaps(s.toCharArray(),'0'));
    }
    
    //checks wrong position when symbol is not present at even positon 
    //(this symbol is present more)
    public int checkSwaps(char[] s, char symbol){
        int swaps=0;
        for(int i=0;i<s.length;i++){
            if(s[i] == symbol && i%2 != 0)
                swaps++;
        }
        return swaps;
    }