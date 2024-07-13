import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        temp t = new temp();
        t.solution(n, k);
    }
    public int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        return 0;
    }
}