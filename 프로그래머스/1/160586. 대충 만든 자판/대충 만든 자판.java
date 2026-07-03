class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] min = new int[keymap.length];

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean impossible = false;

            for (int j = 0; j < targets[i].length(); j++) {
                char t = targets[i].charAt(j);

                int count = 0; // 문자 하나 검사할 때마다 초기화해야 함

                for (int i1 = 0; i1 < keymap.length; i1++) {
                    int push = 0;

                    if (keymap[i1].contains(t + "")) {
                        count++;

                        for (int j1 = 0; j1 < keymap[i1].length(); j1++) {
                            push++;

                            if (t == keymap[i1].charAt(j1)) {
                                break;
                            }
                        }

                        min[i1] = push;
                    } else {
                        min[i1] = 0;
                    }
                }

                // 이번 문자 t를 어떤 keymap에서도 못 찾은 경우
                if (count == 0) {
                    impossible = true;
                    break;
                }

                int index = 0;

                while (index < min.length && min[index] == 0) {
                    index++;
                }

                int m0 = min[index];

                for (int k = 0; k < min.length; k++) {
                    if (min[k] > 0) {
                        m0 = Math.min(m0, min[k]);
                    }
                }

                sum += m0;
            }

            if (impossible) {
                answer[i] = -1;
            } else {
                answer[i] = sum;
            }
        }

        return answer;
    }
}
