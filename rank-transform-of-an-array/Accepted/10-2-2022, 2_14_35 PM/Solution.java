// https://leetcode.com/problems/rank-transform-of-an-array

class Solution {
public int[] arrayRankTransform(int[] arr) {
int nums[]=new int[arr.length];
HashMap<Integer,Integer>map=new HashMap<>();
for(int i=0;i<nums.length;i++){
nums[i]=arr[i];}
Arrays.sort(nums);
int count=1;
for(int i=0;i<nums.length;i++){
if(map.containsKey(nums[i])){
map.put(nums[i],map.get(nums[i]));
continue;}
else{
map.put(nums[i],count);}
count++;
}
for(int i=0;i<arr.length;i++){
if(map.containsKey(arr[i])){
arr[i]=map.get(arr[i]);
}
}
return arr;
}
}