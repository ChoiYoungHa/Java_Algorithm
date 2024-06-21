package TwoPoint;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex_06 ex = new ex_06();
        System.out.print(ex.solution(arr, n, k));
    }

    public int solution(int[] arr, int n, int k) {
        int lt = 0;
        int answer = 0;
        int cnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }
}
