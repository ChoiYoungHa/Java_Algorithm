package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ex_03 ex = new ex_03();
        System.out.println(ex.solution(n,m,arr));
    }

    class Person{
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int [] arr){
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        int answer = 1;


        while(!queue.isEmpty()){
            Person temp = queue.poll();
            for (Person x : queue){
                if (temp.priority < x.priority){
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            // 만약에 break 안 먹히고 넘어왔다면 이 친구는 위험도가 가장 높으니 answer++, 만약에 key가 m과 같으면? retrun
            if (temp != null) {
                if (temp.id == m) return answer;
                else answer++;
            }
        }
        return answer;
    }
}
