package ex02_if;

public class ex_03 {

    public static int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for (int i = 0; i < num_list.length; i++) {
            if ((num_list[i] & 1) == 0){
                even += num_list[i];
            }else {
                odd += num_list[i];
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
