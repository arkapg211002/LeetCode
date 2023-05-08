// https://leetcode.com/problems/ransom-note

class Solution {
public boolean canConstruct(String r, String m) {
    //			RAMSON NOTE CHECK OTHER WORD IS ABLE TO BECOME USING WORDS

	HashMap<Character, Integer> g = new HashMap<>();
//		HashMap<Character, Integer> t = new HashMap<>();
	if(m.length()<r.length()) {
		return false ;
	}
	else {			
		for(int i = 0;i<m.length();i++) {
//                 Instead of this if we want then we can use getofDefault method
			if(g.containsKey(m.charAt(i))) {
				g.put(m.charAt(i), g.get(m.charAt(i))+1);
			}
			else {
				g.put(m.charAt(i),1);
			}
			
			}
		for(Character c : r.toCharArray()) {
			int remaining = g.getOrDefault(c, 0);
			if(remaining == 0) {
				return false;
			}
			g.put(c, remaining-1);
		}
		}
	return true;
}
}