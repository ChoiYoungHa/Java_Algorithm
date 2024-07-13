package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ex_01 ex = new ex_01();
        System.out.println(ex.solution(n,k));

    }

    public int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        // 큐의 첫번째 두번째 값을 큐에 삽입과 동시에 삭제
        // k값은 삽입하지 않고 그냥 삭제
        // 값을 poll 하고, 다시 큐에 삽입 + 1
        // 만약에 count == k 면 poll만 수행
        int count = 0;
        while (queue.size() != 1) {
            count++;
            if (count == k) {
                queue.poll();
                count = 0;
            }
            Integer addValue = queue.poll();
            queue.offer(addValue);
        }
        return queue.poll();
    }
}
