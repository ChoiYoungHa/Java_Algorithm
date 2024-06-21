package TwoPoint;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half = (n / 2) + 1;
        int[] arr = new int[half + 1];
        for (int i = 1; i <= half; i++) {
            arr[i] = i;
        }

        ex_05 ex = new ex_05();
        System.out.print(ex.solution(arr, half, n));
    }

    public int solution(int[] arr, int half, int n) {
        int lt = 1;
        int sum = 0;
        int answer = 0;
        for (int rt = 1; rt <= half; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum > n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }
}
