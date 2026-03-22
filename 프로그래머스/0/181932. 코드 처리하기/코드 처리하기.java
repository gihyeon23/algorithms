class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for(int i = 0; i < code.length(); i++) {
            switch (mode) {
                case 1: {
                    if(code.charAt(i) == '1') {
                        mode = 1 - mode;
                        } else {
                            if(i % 2 != 0) {
                                ret += code.charAt(i);
                                }
                            }
                    break;
                }
                case 0: {
                    if(code.charAt(i) == '1') {
                        mode += 1;
                    } else {
                        if(i % 2 == 0) {
                            ret += code.charAt(i);
                        }
                    }  
                    break;
                }
            }
        }

        return ret.equals("") ? "EMPTY" : ret;
    }
}