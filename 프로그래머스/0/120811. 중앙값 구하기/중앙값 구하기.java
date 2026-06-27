import java.util.Arrays;

class Solution {
    public int solution(int[] array) {

        Arrays.sort(array);
        int i = array.length / 2;
        System.out.print(i);
        return array[i];
    }
}