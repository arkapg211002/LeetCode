// https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    public int titleToNumber(String columnTitle) {
	int N = columnTitle.length();
	int exponent = 0, sum = 0;

	for (int i=N-1; i>=0; i--)
		sum += getValue(columnTitle.charAt(i)) * Math.pow(26, exponent++);

	return sum;
}

private int getValue(char ch) {
	return ch - 'A' + 1;
}
}