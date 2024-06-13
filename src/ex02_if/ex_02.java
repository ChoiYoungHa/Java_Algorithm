package ex02_if;

public class ex_02 {
    public static int solution(int[] num_list) {
        int square_sum = 0;
        int multiply = 1;
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            square_sum += num_list[i];
            multiply *= num_list[i];
        }
        square_sum = (int) Math.pow(square_sum, 2);

        if (square_sum > multiply) {
            answer = 1;
        }

        return answer;
    }
}
