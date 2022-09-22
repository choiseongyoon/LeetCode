
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int numberOfMoves = 0;
        for (int i = 0; i < seats.length; ++i) {
            numberOfMoves += Math.abs(seats[i] - students[i]);
        }
        return numberOfMoves;
    }
}