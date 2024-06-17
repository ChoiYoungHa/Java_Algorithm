package Array;

import java.net.Inet4Address;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ex04 ex04 = new ex04();
        int result = ex04.solution(arr, n);

        System.out.println(result);
    }

    public int solution(int[][] arr, int n) {
        int max = Integer.MIN_VALUE;
        int rank = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                rank = i;
            }
        }
        return rank;
    }
}
