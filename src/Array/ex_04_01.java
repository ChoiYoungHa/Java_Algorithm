package Array;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class ex_04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ex_04_01 ex = new ex_04_01();
        int answer = ex.solution(arr, n);
        System.out.println(answer);
    }

    public int solution(int[][] arr, int n) {
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }

        return answer;

    }
}
