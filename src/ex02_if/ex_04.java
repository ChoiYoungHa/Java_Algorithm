package ex02_if;

import java.util.ArrayList;

public class ex_04 {
    public static int[] solution(int[] num_list) {
        int add_num = 0;
        int length = num_list.length - 1;
        if (num_list[length] > num_list[length - 1]) {
            add_num = num_list[length] - num_list[length - 1];
        }else{
            add_num = num_list[length] * 2;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        list.add(add_num);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
