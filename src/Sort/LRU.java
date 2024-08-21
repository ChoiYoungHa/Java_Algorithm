package Sort;

import sun.awt.image.ImageWatched;

import java.util.LinkedHashMap;
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

        for(int value : x){
            if (!lru.contains(value)){
                lru.offer(value);
            }else{
                // 이미 존재한다면 다시 삽입을하고, 만약에 사이즈가 넘으면 가장 첫번째로 들어온 것을 지운다.
                lru.offer(value);
                if (size < lru.size()) {
                    lru.poll();
                }
            }
        }

        return x;
    }
}
