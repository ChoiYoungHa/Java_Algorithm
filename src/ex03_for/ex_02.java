package ex03_for;

import java.util.ArrayList;

public class ex_02 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int idx = start_num; idx <= end_num; idx++){
            list.add(idx);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
