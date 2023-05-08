// https://leetcode.com/problems/sort-array-by-increasing-frequency

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i])==false)hm.put(nums[i],1);
            else hm.put(nums[i],hm.get(nums[i])+1);
        }
        int a[][]=new int[hm.size()][2];int k=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            a[k][0]=e.getKey();
            a[k][1]=e.getValue();
            k+=1;
        }
        //System.out.println(hm);
        Arrays.sort(a,new Comparator<int[]>()
                    {
                        @Override
                        public int compare(int c[],int d[])
                        {
                            if(c[1]<d[1])return -1;
                            else if(c[1]>d[1])return 1;
                            else return (c[0]>d[0])?-1:1;
                            //else return 0;
                        }
                    });
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i][0]+" ");
        }
        //System.out.println();       
        int res[]=new int[nums.length],m=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i][1];j++)
            {
                res[m]=a[i][0];m+=1;
            }
        }
        return res;
    }
}