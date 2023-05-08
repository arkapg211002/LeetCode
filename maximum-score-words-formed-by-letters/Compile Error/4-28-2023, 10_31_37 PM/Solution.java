// https://leetcode.com/problems/maximum-score-words-formed-by-letters

class Solution {
    boolean check(HashMap<Character,Integer>letters,String word){
        for (char c:word.toCharArray()){
            boolean res=true;
            if (letters.getOrDefault(c,0)<=0) {
                boolean res=false;
            }
            else{
                letters.put(c,letters.get(c)-1);
            }
            
        }
        return true;
    }
    public int earn(int a,String[] words,HashMap<Character,Integer>letters, int[] score,int []memo){
        if (memo[a]!=-1){
            return memo[a];
        }
        int ans=0;
        for (int i=0;i<words.length;i++){
            HashMap<Character,Integer>tempt=new HashMap();
            for (char c : letters.keySet()){
                        tempt.put(c,letters.get(c));
                    }
            if (((a>>i)&1)==1){
                int temp=0;
                if (check(tempt,words[i])) {
                    for (char c : words[i].toCharArray()){
                        temp+=score[c-'a'];
                    }
                    ans=Math.max(earn(a&~(1<<i),words,tempt,score,memo)+temp,ans);}
            }
        }
        memo[a]=ans;
        return ans;
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        HashMap<Character,Integer>letter=new HashMap();
        int [] memo= new int [(int)Math.pow(2,words.length)];
        Arrays.fill(memo,-1);
        for(char item:letters){
             letter.put(item,letter.getOrDefault(item,0)+1);
        }
        return earn((int)Math.pow(2,words.length)-1,words,letter,score,memo);
    }
}