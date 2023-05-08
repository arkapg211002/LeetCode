// https://leetcode.com/problems/maximum-number-of-balloons

class Solution {
public int maxNumberOfBalloons(String text) {
int[] array = new int[26];
var res = 0;

    for (char c : text.toCharArray()) {
            array[c-'a']++;
    }

    while (true){
        for (char c: "balloon".toCharArray()){
            array[c-'a']--;
            if (array[c-'a'] ==-1)
                return res;
        }
        res ++;
    }
}
}