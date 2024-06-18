package TwoPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        ex_01 ex = new ex_01();
        int [] answer = ex.solution(arr, arr2, n, m);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int[] arr, int[] arr2, int n, int m) {
        int p1 = 0;
        int p2 = 0;

        ArrayList<Integer> answer = new ArrayList<Integer>();

        while (p1 < n && p2 < m) {
            if (arr[p1] < arr2[p2]){
                answer.add(arr[p1++]);
            } else answer.add(arr2[p2++]);
        }

        while(p1 < n) answer.add(arr[p1++]);
        while(p2 < m) answer.add(arr2[p2++]);

        return answer.stream().mapToInt(i -> i).toArray();
    }


}
