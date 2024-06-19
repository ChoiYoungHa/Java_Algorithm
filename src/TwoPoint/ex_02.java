package TwoPoint;



import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        ex_02 ex = new ex_02();
        int[] answer = ex.solution(arr, arr2, n, m);
        for (int i : answer) {
            System.out.printf(i+" ");
        }
    }

    public int[] solution(int[] arr, int[] arr2, int n, int m) {
        int p1 = 0;
        int p2 = 0;
        // 정렬부터
        Arrays.sort(arr);
        Arrays.sort(arr2);

        ArrayList<Integer> answer = new ArrayList<>();
        while (p1 < n && p2 < m) {
            if (arr[p1] == arr2[p2]) {
                answer.add(arr[p1]);
                p1++;
                p2++;
            }else if (arr[p1] < arr2[p2]) p1++;
            else p2++;
        }
        return answer.stream().mapToInt(i -> i).toArray();

    }
}
