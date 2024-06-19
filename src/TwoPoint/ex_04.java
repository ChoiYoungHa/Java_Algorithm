package TwoPoint;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex_04 ex = new ex_04();
        System.out.print(ex.solution(arr, n, m));
    }

    public int solution(int[] arr, int n, int m) {
        int sum = 0;
        int lt = 0;
        int answer  = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
                sum -= arr[lt++];
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }

        }
        return answer;
    }


}
