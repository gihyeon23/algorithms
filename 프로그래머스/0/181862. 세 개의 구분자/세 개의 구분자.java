class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        myStr = myStr.replaceAll("[abc]+", " ").trim();

        return myStr.isEmpty() ? new String[]{"EMPTY"} : myStr.split(" ");
    }
}