package Sort;


import java.util.Deque;
import java.util.LinkedList;
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

        Deque<Integer> answer = solution(size, arr);
        answer.forEach(i -> System.out.print(i + " "));
    }

    public static Deque<Integer> solution(int size, int[] x){
        Deque<Integer> lru = new LinkedList<>();
        for(int value : x){
            if (!lru.contains(value)) {
                if (lru.size() == size){
                    lru.removeLast();
                    lru.addFirst(value);
                }else{
                    lru.addFirst(value);
                }
            } else {
                lru.remove(value);
                lru.addFirst(value);
            }
        }

        return lru;
    }
}
