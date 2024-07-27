package Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String must = sc.nextLine();
        String plan = sc.nextLine();

        ex_02 ex = new ex_02();
        System.out.println(ex.solution(must, plan));
    }

    // CBA 순서대로 교육과정을 들어야한다.
    // 큐에 해당 값이 존재하면서 poll 했을 때 해당값이라면? true
    // 큐에 해당 값이 존재하는데 poll 했을 때 해당 값이 아니라면 fasle
    // 해당값이 있으면 poll 하고, 없으면 poll 안함.
    // 대신에 해당 값이 있어서 poll 했는데 그 값이 poll 반환값이랑 일치하지 않으면 no 반환
    // F 즉 정규교과목을 계획표에 넣지도 않았으면 No 반환이지.
    // 그렇다면? 큐의 값이 0이 아니라면? NO
    public String solution(String must, String plan) {
        Queue<Character> queue = new LinkedList<>();
        for (char x :  must.toCharArray()){
            queue.offer(x);
        }

        for (char x : plan.toCharArray()){
            if (queue.contains(x)){
                Character poll = queue.poll();
                if (!poll.equals(x)) return "NO";
            }
        }

        if (!queue.isEmpty()) return "NO";
        return "YES";
    }
}
