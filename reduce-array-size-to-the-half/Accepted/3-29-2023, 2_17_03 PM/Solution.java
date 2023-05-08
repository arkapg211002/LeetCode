// https://leetcode.com/problems/reduce-array-size-to-the-half

class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i])==false)h.put(arr[i],1);
            else h.put(arr[i],h.get(arr[i])+1);
        }
        int a[][]=new int[h.size()][2];
        int k=0;
        //System.out.println(h);
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            a[k][0]=e.getKey();
            a[k][1]=e.getValue();
            k+=1;
        }
        Arrays.sort(a,(x,y)->
        {
            if(x[1]>y[1])return -1;
            else if(x[1]<y[1])return 1;
            else return 0;
        });
        int n=arr.length/2;
        int c=0,s=0;
        for(int i=0;i<a.length;i++)
        {
            //System.out.print(a[i][1]+" ");
            s+=a[i][1];
            c+=1;
            if(s>=n)break;
        }
        return c;
    }
}