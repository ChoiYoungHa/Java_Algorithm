package Sort;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LRU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // 사이즈
        int x = sc.nextInt(); // 입력값
        int [] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        int[] solution = solution(size, arr);
        for (int value : solution) {
            System.out.println(value);
        }
    }

    public static int[] solution(int size, int[] x){

        Queue<Integer> lru = new LinkedList<>();
        // 어떻게 사이즈를 특정짓지? 아 queue 사이즈!
        // 배열을 생성할 필요없이 사용자가 입력한 값이 사이즈가 되고, 이 사이즈가 큐 사이즈가 된다면? 큐가 다 찬거
        // 거기서 만약에 1개가 더 들어왔고 hit가 되지 않았다면 마지막걸 pop 하면 되겠네?
        //

        for (int i = 0; i < x.length; i++) {
            lru.offer(x[i]);
            if (lru.contains(x[i])) {

            }
        }
        return x;
    }
}
