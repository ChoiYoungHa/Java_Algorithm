import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int res = solution(num);
        System.out.println(res);

    }

    public static int solution(int num) {

        int  answer = num - 1;

        for (int i = 6; i <= num; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                answer--;
                System.out.println(i);
            }
        }
        return answer;

    }
}
