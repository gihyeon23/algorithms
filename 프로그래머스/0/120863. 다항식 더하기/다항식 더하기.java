class Solution {
    public String solution(String polynomial) {
        int[] sumArr = new int[2];
        String[] pArr = polynomial.split(" ");

        for (int i = 0; i < pArr.length; i += 2) {
            if (pArr[i].contains("x")) {
                String coefficient = pArr[i].replace("x", "");
                int tmp = coefficient.isEmpty()
                        ? 1
                        : Integer.parseInt(coefficient);

                sumArr[0] += tmp;
            } else {
                sumArr[1] += Integer.parseInt(pArr[i]);
            }
        }

        String answer = "";

        if (sumArr[0] > 0) {
            answer = sumArr[0] == 1 ? "x" : sumArr[0] + "x";
        }

        if (sumArr[1] > 0) {
            if (!answer.isEmpty()) {
                answer += " + ";
            }
            answer += sumArr[1];
        }

        return answer;
    }
}