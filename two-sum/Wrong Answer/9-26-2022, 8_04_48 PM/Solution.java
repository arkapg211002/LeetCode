// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*HashSet<Integer>hm=new HashSet<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.add(nums[i]);
            h.put(nums[i],i);
        }
        List<Integer>l=new ArrayList<>(l);
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            if(l.indexOf())
        }*/
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
        //System.out.println(l);
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int rem=target-nums[i];
            //System.out.println(rem+" "+l.lastIndexOf(rem));
            //if(l.lastIndexOf(rem)==-1)continue;
             if(l.contains(rem)==true)
            {
                a[0]=i;
                a[1]=l.indexOf(rem);
                //break;
            }
            if(a[0]!=0 && a[1]!=0)break;
        }
        return a;
    }
}