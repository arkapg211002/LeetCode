// https://leetcode.com/problems/the-skyline-problem

class BuildPoint implements Comparable<BuildPoint>
{
    int start;
    int hieght;
    boolean isStart;
    public int compareTo(BuildPoint curr)
    {
        if(this.start!=curr.start)  return this.start-curr.start;
    else
    {
       return ((this.isStart) ? -this.hieght : this.hieght)-((curr.isStart) ? -curr.hieght : curr.hieght); 
    }
    }
}

class Solution 
{
    public List<List<Integer>> getSkyline(int[][] buildings)
    {
        List<List<Integer>> ans=new ArrayList<>();
        BuildPoint[] points=new BuildPoint[buildings.length*2];
        int idx=0;
        for(int[] i : buildings)
        {
            BuildPoint obj=new BuildPoint();
            obj.start=i[0];
            obj.isStart=true;
            obj.hieght=i[2];
            points[idx]=obj;
            idx++;
            BuildPoint obj1=new BuildPoint();
            obj1.start=i[1];
            obj1.isStart=false;
            obj1.hieght=i[2];
            points[idx]=obj1;
            idx++;
        }
        Arrays.sort(points);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(0,1);
        int prevMax=0;
        for(BuildPoint point : points)
        {
            if(point.isStart) map.put(point.hieght,map.getOrDefault(point.hieght,0)+1);
            else
            {
                int value=map.get(point.hieght);
                if(value-1==0)  map.remove(point.hieght);
                else map.put(point.hieght,value-1);
            }
            int currmax=map.lastKey();
            if(currmax !=prevMax)
            {
                ans.add(Arrays.asList(point.start,currmax));
                prevMax=currmax;
            }
        }
        return ans;
    }
}