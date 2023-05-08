// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int c=0;
        for(int i=0;i<seats.length;i++)
        {
            int d=(int)Math.abs(seats[i]-students[i]);
            c+=d;
        }
        return c;
    }
}