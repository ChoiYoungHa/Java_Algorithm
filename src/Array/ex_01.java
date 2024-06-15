package Array;

import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        int[] ranking = getRanking(arr, num);

        for (int i : ranking) {
            System.out.print(i + " ");
        }
    }

    public static int[] getRanking(int[] arr, int num){
        int[] answer = new int[num];
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
