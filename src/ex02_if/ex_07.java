package ex02_if;

import java.util.ArrayList;

public class ex_07 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int change_front = queries[i][0];
            int change_back = queries[i][1];
            int temp = 0;

            temp = arr[change_front];
            arr[change_front] = arr[change_back];
            arr[change_back] = temp;

        }
        return arr;
    }
}
