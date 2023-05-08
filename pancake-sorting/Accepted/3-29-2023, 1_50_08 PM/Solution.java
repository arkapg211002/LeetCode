// https://leetcode.com/problems/pancake-sorting

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer>l=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            int md=i;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>arr[md])md=j;
            }
            if(md!=i)
            {
                if(md!=0)
                {
                    rev(arr,0,md);
                    l.add(md+1);
                }
                rev(arr,0,i);
                l.add(i+1);
            }
        }
        return l;
    }
    public void rev(int arr[],int l,int r)
    {
        while(l<=r)
        {
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l+=1;
            r-=1;
        }
    }
}