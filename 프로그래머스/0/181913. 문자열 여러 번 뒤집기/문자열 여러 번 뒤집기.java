class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            String re = "";
            for (int j = e; j >= s; j--) {
                re += my_string.charAt(j);
            }

            String before = my_string.substring(0, s);
            String after = my_string.substring(e + 1);

            my_string = before + re + after;
        }

        return my_string;
    }
}