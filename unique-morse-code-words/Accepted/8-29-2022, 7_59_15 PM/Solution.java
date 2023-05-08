// https://leetcode.com/problems/unique-morse-code-words

class Solution {
public int uniqueMorseRepresentations(String[] words) {
HashMap<Character,String> hash = new HashMap<>();
hash.put('a',".-");
hash.put('b',"-...");
hash.put('c',"-.-.");
hash.put('d',"-..");
hash.put('e',".");
hash.put('f',"..-.");
hash.put('g',"--.");
hash.put('h',"....");
hash.put('i',"..");
hash.put('j',".---");
hash.put('k',"-.-");
hash.put('l',".-..");
hash.put('m',"--");
hash.put('n',"-.");
hash.put('o',"---");
hash.put('p',".--.");
hash.put('q',"--.-");
hash.put('r',".-.");
hash.put('s',"...");
hash.put('t',"-");
hash.put('u',"..-");
hash.put('v',"...-");
hash.put('w',".--");
hash.put('x',"-..-");
hash.put('y',"-.--");
hash.put('z',"--..");
HashSet set = new HashSet<>();
for(String word : words)
{
String s = "";
for(int i = 0;i<word.length();i++)
{
s+=hash.get(word.charAt(i));
}
set.add(s);
s="";
}
return set.size();
}
}