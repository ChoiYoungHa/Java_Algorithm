package ex02_if;

import java.util.ArrayList;

public class ex_08 {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < queries.length; i++){
            int q = queries[i][2];
            int minValue = Integer.MAX_VALUE;
            boolean found = false;

            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(q < arr[j] && arr[j] < minValue){
                    minValue = arr[j];
                    found = true;
                }
            }
            if(found){
                list.add(minValue);
            }else{
                list.add(-1);
            }

        }
        int [] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
