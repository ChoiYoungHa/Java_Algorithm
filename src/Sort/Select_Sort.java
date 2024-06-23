package Sort;

import java.util.Scanner;

public class Select_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Select_Sort ss = new Select_Sort();
        int[] answer = ss.solution(arr, n);
        for (int i : answer) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]){
                    idx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        return arr;
    }
}
