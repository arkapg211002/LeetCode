// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Solution {
    public boolean digitCount(String s) {
        List<Integer> listStr = s.chars().boxed().collect(Collectors.toList());
		Map<Integer,Integer> map = s.chars().boxed().distinct()
								.collect(Collectors.toMap(ch->ch, ch->Collections.frequency(listStr, ch)));
		int i=0;
		for(i=0;i<s.length();i++) {
			if(map.get(i+48)==null) {
				map.merge(i+48, 0, (a,b)->a+b);
			}
			if(!(map.get(i+48)==(listStr.get(i).intValue()-48))) {
				return false;
			}
		}
		return true;
    }
}