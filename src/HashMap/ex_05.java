package HashMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex_05 ex = new ex_05();
        System.out.println(ex.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int answer = it.next();
            count++;
            if (count == k) return answer;
        }
        return -1;
    }
}