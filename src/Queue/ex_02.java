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
        String answer = ex.solution(must, plan);

    }

    public String solution(String must, String plan){
        Queue<Character> q = new LinkedList<>();

        for (char x : must.toCharArray()) {
            q.offer(x);
        }

        for (char that : plan.toCharArray()) {

        }

        // 필수이수과목
        // 수업계획
        // 필수이수 과목을 순서대로 듣는 수업계획이어야만 YES, 아니면 NO

        // 필수과목을 큐에 넣고 순서대로 큐에 해당하는 계획을 실행한다면 큐에서 제외, 큐에 없는걸 실행한다면 NO반환

        return null;

    }
}
