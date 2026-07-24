class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        int index = 0;
        //max 1
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max1) {
                max1 = numbers[i];
                index = i;
            }
        }
        numbers[index] = 0;
        //max2
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max2) {
                max2 = numbers[i];
            }
        }
        
        return max1 * max2;
    }
}