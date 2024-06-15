package Array;

import java.util.Scanner;

public class ex_03 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ex_03 ex_03 = new ex_03();
        int answer= ex_03.solution(arr,n);
        System.out.print(answer);
    }

    public int solution(int[][] arr, int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k =0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[i][j] <= arr[nx][ny]){
                        flag=false;
                        break;
                    }
                }
                if (flag == true) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
