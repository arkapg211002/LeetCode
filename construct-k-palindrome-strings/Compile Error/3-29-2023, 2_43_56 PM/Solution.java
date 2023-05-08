// https://leetcode.com/problems/construct-k-palindrome-strings

public boolean canConstruct(String s, int k) {
		if(s.length()<k) {
			return false;
		}
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		int odd=0;
		for(int count:map.values()) {
			if(count%2==1) {
				odd++;
			}
		}
		return odd<=k;
        
    }