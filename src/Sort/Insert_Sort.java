package Sort;

import java.util.Scanner;

public class Insert_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Insert_Sort ss = new Insert_Sort();
        int[] answer = ss.solution(arr, n);
        for (int i : answer) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) arr[j + 1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
