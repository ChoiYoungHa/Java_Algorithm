package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex_03 ex = new ex_03();
        int[] answer = ex.solution(arr, n, k);
        for (int x : answer) {
            System.out.print(x+" ");
        }
    }

    public int[] solution(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int rt = k -1;
        for (int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int lt = 0; lt <= n - k; lt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            list.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if ((map.get(arr[lt]) == 0)) {
                map.remove(arr[lt]);
            }
            rt++;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
