package Array;

import javax.naming.spi.DirObjectFactory;
import java.util.Scanner;

public class ex_05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ex_05_01 ex = new ex_05_01();
        System.out.print(ex.solution(arr, n, m));
    }

    public int solution(int[][] arr, int n, int m) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int rank_i = 0, rank_j = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) rank_i = s;
                        if (arr[k][s] == j) rank_j = s;
                    }
                    if (rank_i < rank_j) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }
}
