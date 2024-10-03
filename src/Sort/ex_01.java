package Sort;

import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr = new int [size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] answer = solution(size, arr);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int n, int[] arr) {
        // 1, 철수, 2 철수친구
        int check = 0;
        int[] answer = new int[2];

        for (int i = 0; i < n - 1; i++) {
            if (check != 1 && arr[i] > arr[i + 1]) {
                answer[check] = i + 1;
                check++;
            } else if (check == 1 && arr[i] > arr[i + 1]) {
                answer[check] = i + 2;
            }
        }

        return answer;
    }

}
