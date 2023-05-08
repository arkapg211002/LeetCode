// https://leetcode.com/problems/categorize-box-according-to-criteria

import java.math.BigInteger;

class Solution {
     public String categorizeBox(int length, int width, int height, int mass) {
            int maxBulky = 10000;
            boolean isBulky =false;
            boolean isHeavy = false;
            boolean isBoth = false;
//caculating volume
            BigInteger bigInteger = new BigInteger(String.valueOf(length))
                                    .multiply(
                                    new BigInteger(String.valueOf(width)))
                                    .multiply(
                                    new BigInteger(String.valueOf(height)));
            
            if(bigInteger.compareTo(new BigInteger(String.valueOf(Long.valueOf(1000000000l))))>=0 
                || 
            (length>=maxBulky 
                || 
            width >=maxBulky 
                || 
            height >=maxBulky 
                || 
            mass >=maxBulky ))
                                isBulky = true;
            if(mass>=100) 
                                isHeavy = true;

            if(isBulky ==true && isHeavy ==true ) 
                                return "Both";
            else if(isBulky ==false && isHeavy ==false) 
                                return "Neither";
            else if(isBulky ==true && isHeavy ==false) 
                                return "Bulky";
            else 
                                return "Heavy";
        }
}