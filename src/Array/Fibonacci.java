package Array;

public class Fibonacci {

    // 피보나치 수열 기본문제
    public static int [] solution(int num) {

        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < num; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }
}
