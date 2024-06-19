package TwoPoint;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex_03 ex = new ex_03();
        int answer = ex.solution(arr, n, k);
        System.out.print(answer);
    }

    public int solution(int[] arr, int n, int k) {
        int answer = 0;
        int window = 0;
        for (int i = 0; i < k; i++) {
            window += arr[i];
        }
        answer = window;

        for (int i = k; i < n; i++) {
            window = window + arr[i];
            window -= arr[i-k];
            if (window > answer){
                answer = window;
            }
        }
        return answer;
    }
}
