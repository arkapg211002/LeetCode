// https://leetcode.com/problems/minimum-index-sum-of-two-lists

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int m=1999;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j]))
                    if(m>i+j)
                        m=i+j;
            }
        }
        List<String> l=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j]) && m==i+j)
                    l.add(list1[i]);
            }
        }
        return l.toArray(new String[0]);
    }
}