// https://leetcode.com/problems/task-scheduler

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0)return tasks.length;
        int c=0,max=Integer.MIN_VALUE;
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
            if(h.containsKey(tasks[i])==false)h.put(tasks[i],1);
            else h.put(tasks[i],h.get(tasks[i])+1);
        }
        for(Map.Entry<Character,Integer>e:h.entrySet())
            max=(int)Math.max(max,e.getValue());
        for(Map.Entry<Character,Integer>e:h.entrySet())
            if(e.getValue()==max)c+=1;
        return (max-1)*(n+1)+c;
    }
}