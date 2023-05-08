// https://leetcode.com/problems/count-items-matching-a-rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(int i=0;i<items.size();i++)
        {
            if(ruleKey.equals("type")==true && ruleValue.equals(items.get(i).get(0))==true)c++;
            else if(ruleKey.equals("color")==true && ruleValue.equals(items.get(i).get(1))==true)c++;
            else if(ruleKey.equals("name")==true && ruleValue.equals(items.get(i).get(2))==true)c++;
        }
        return c;
    }
}