package ex03_for;

import java.util.ArrayList;

public class ex_03 {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        int x = n;
        while(x > 1){
            if(x % 2 == 0){
                x = x / 2;
            }else{
                x = 3 * x + 1;
            }
            list.add(x);
        }

        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
