class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int size1 = arr1.length;
        int size2 = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        
        //사이즈 다를때
        if(size1 != size2) {
            if(size1 > size2) {
                answer = 1; 
            } else if(size1 < size2) {
                answer = -1;
            }
        } //사이즈 같을때 
        else {
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1 > sum2) {
                answer = 1;
            } else if(sum1 < sum2) {
                answer = -1;
            }
        }

        return answer;
    }
}