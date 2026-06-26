class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while(true) {
            int before = 0;
            boolean b = false; //바뀐거 없음
            
            for(int i = 0; i < arr.length; i++) {
                before = arr[i];
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                    
                    } else if (arr[i] <= 50 && arr[i] % 2 == 1) {
                        arr[i] = arr[i] * 2 + 1;
                    }
                    //하나라도 바뀌면 스위치 바꾸기
                    if(before != arr[i]) {
                            b = true;
                    }   
                }
            //스위치 바꾸기를 하나도 안한다면 변한게 없다는 뜻 탈출
            if(b == false) {
                break;
            }
            
            answer++;
        }
        return answer;
    }
}