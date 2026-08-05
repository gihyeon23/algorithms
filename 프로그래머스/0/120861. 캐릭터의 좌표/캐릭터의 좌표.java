class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = new int[2];
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String s : keyinput) {
            if (s.equals("left")  && result[0] > -maxX) result[0]--;
            else if (s.equals("right") && result[0] <  maxX) result[0]++;
            else if (s.equals("down")  && result[1] > -maxY) result[1]--;
            else if (s.equals("up")    && result[1] <  maxY) result[1]++;
        }

        return result;
    }
}