package Array;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = solution(arr, n);
        System.out.print(answer);
    }

    public static int solution(int [][] arr, int n){
        int find = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            find = Math.max(find, sum1);
            find = Math.max(find, sum2);
        }

        sum1 = 0;
        sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        find = Math.max(sum1, find);
        find = Math.max(sum2, find);

        return find;
    }
}
