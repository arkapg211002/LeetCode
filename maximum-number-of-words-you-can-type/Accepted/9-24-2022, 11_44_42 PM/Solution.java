// https://leetcode.com/problems/maximum-number-of-words-you-can-type

class Solution {
    public int canBeTypedWords(String text, String bl) {
        String[] list = text.split(" ");
        String[] chars = bl.split("");
        int ans = 0;
        for(String ls: list) {
            for(int j = 0; j != bl.length(); ++j) {
                if (ls.contains(chars[j])) {
                    ans--;
                    break;
                }
            }
            ans++;
        }
        return ans;
    }
}