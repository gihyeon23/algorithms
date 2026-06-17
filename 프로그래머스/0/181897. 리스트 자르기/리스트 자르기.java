class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        switch (n) {
            case 1: 
                answer = new int[slicer[1] + 1];
                for ( int i=0; i < slicer[1] + 1; i++ ) {
                    answer[i] = num_list[i]; 
                }
                break;
                
         
              case 2:
                answer = new int[num_list.length - slicer[0]];
                for (int i = slicer[0]; i < num_list.length; i++) { 
                answer[i - slicer[0]] = num_list[i]; 
               }
                 break;
                
        
                
            case 3:
                answer = new int[slicer[1] - slicer[0] + 1];
                for (int i = slicer[0]; i < slicer[1] + 1; i++) {
                    answer[i - slicer[0]] = num_list[i];
                }
                break;
                
            case 4:
                int length = (slicer[1] - slicer[0]) / slicer[2] + 1;
                answer = new int[length];

                int index = 0;
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    answer[index] = num_list[i];
                    index++;
                }
                break;
        }
        
        return answer;
    }
}