class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[2]);
            int result = Integer.parseInt(tmp[4]);

            int calc = tmp[1].equals("+") ? a + b : a - b;
            answer[i] = (calc == result) ? "O" : "X";
        }

        return answer;
    }
}