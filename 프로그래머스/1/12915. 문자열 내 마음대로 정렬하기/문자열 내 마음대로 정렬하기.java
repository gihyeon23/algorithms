import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        //정렬 알고리즘이라면 알아야한다고 함...
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.charAt(n) != b.charAt(n))
                    return a.charAt(n) - b.charAt(n);  // n번째 글자 비교
                return a.compareTo(b);                  // 같으면 사전순
            }
        });
        return strings;
    }
}