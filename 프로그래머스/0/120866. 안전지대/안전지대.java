class Solution {
    public int solution(int[][] board) {
        //1은 지뢰, 0은 안전지대
        //[0, 0, 0, 0, 0]
        //[0, 0, 0, 0, 0]
        //[0, 0, 0, 0, 0]
        //[0, 0, 1, 1, 0]
        //[0, 0, 0, 0, 0]
        
        int answer = 0;
        int safe_zone = board.length * board.length;
        int danger_zone;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                //지뢰를 발견
                if(board[i][j] == 1) {
                    //중복으로 찾게 안하기 위해서 2로 설정
                    board[i][j] = 2;
                    
                    //폭탄 근처 2로 만들기
                    for(int k = i-1; k <= i+1; k++) {
                        for(int g = j-1; g <= j+1; g++) {
                            if(((k >= 0 && g >= 0 && k < board.length && g < board.length) && board[k][g] != 1)) {
                                board[k][g] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return (answer);
    }
}