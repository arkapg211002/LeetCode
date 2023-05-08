// https://leetcode.com/problems/rabbits-in-forest

class Solution {
    public int numRabbits(int[] answers) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<answers.length;i++)
        {
            h.add(answers[i]);
        }
        int c=0;
        Iterator<Integer>it=h.iterator();
        while(it.hasNext())
        {
            c+=it.next()+1;
        }
        return c;
    }
}