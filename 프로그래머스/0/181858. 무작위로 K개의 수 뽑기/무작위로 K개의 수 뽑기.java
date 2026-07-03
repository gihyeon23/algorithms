 class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        String as = " ";

        for (int i = 0; i < arr.length; i++) {
            String value = " " + arr[i] + " ";

            if (!as.contains(value)) {
                as = as + arr[i] + " ";
            }
        }

        String[] tmp = as.trim().split(" ");

        for (int i = 0; i < k; i++) {
            if (i < tmp.length) {
                answer[i] = Integer.parseInt(tmp[i]);
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}