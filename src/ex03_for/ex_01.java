package ex03_for;

import java.util.ArrayList;
import java.util.List;

public class ex_01 {
    public int[] solution(int l, int r) {
        int [] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(FiveOrZero(i)){
                if(i != 0){
                    list.add(i);
                }
            }
        }
        if(list.isEmpty()){
            answer = new int[]{-1};
        }else{
            answer = list.stream().mapToInt(i -> i).toArray();
        }

        return answer;

    }

    public boolean FiveOrZero(int number){
        String temp = String.valueOf(number);
        for(char c : temp.toCharArray()){
            if(c != '0' && c != '5'){
                return false;
            }
        }
        return true;
    }
}


