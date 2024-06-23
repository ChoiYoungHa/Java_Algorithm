package Sort;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Bubble_Sort ss = new Bubble_Sort();
        int[] answer = ss.solution(arr, n);
        for (int i : answer) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
