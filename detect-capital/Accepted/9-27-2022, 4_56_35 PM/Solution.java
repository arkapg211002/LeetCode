// https://leetcode.com/problems/detect-capital

class Solution {
public boolean detectCapitalUse(String w) {
boolean flag=false;
if(w.charAt(0) >= 'A' && w.charAt(0) <= 'Z') flag=true;
int cap=0,low=0;
for(int i=1; i<w.length(); ++i){
if(w.charAt(i) >= 'A' && w.charAt(i) <= 'Z') cap++;
else low++;
}
if(low == w.length()-1) return true;
if(flag && cap == w.length()-1) return true;
return false;
}
}