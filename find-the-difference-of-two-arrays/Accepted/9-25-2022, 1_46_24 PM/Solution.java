// https://leetcode.com/problems/find-the-difference-of-two-arrays

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>n1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer>n2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        HashSet<Integer>a=new HashSet<>();
        HashSet<Integer>b=new HashSet<>();
        for(int i=0;i<n1.size();i++)
            if(n2.contains(n1.get(i))==false)a.add(n1.get(i));
        l.add(new ArrayList<>(a));
        for(int i=0;i<n2.size();i++)
            if(n1.contains(n2.get(i))==false)b.add(n2.get(i));
        l.add(new ArrayList<>(b));
        return l;
    }
}