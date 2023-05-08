// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated

class Solution {
	public boolean check(int[] a) {
		 int c=0;
		 if(a[0]<a[a.length-1])c++;
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1])c++;

		}


		return c<=1;
	}

}