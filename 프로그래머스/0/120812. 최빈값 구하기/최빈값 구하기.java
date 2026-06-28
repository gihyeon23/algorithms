import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[array.length];
        int cI = 0;
        int before = 0;
        
        Arrays.sort(array);
        int max = array[0]; //처음 인덱스로 초기화
        
        if(array.length == 1) {
            return array[0];
        }
        
        for(int i = 1; i < array.length; i++) {
            System.out.print(i + " : ");
            
            if(max == array[i]) {
                System.out.print("count 증가");
                count[cI]++;
            } else {
                System.out.print("다른값 등장");
                cI++; //이 두줄의 작업은 새로 들어온 다른 숫자의 개수랑 비교하기 위해 저장
                max = array[i];
            }
            System.out.print("|before 값 :  " + before +  " cI : " + cI + " count값 : " + count[cI]);
            
            if(before < count[cI]) {
                before = count[cI];
                answer = array[i];
                System.out.print(" 최대값 : " + answer + " ");
            }
            
        System.out.println();
        }
        //중복 count 확인
        Arrays.sort(count);
        for(int i = 0; i < count.length; i++) {
            if(count[count.length - 1] == count[count.length - 2]) {
                return -1;
            }
            System.out.print(count[i]);
        }
        
        return answer;
    }
}