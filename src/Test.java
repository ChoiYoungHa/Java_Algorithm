import java.util.*;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] solution = solution(m, n);
        for (int i = m; i < n + 1; i++) {
            if (solution[i] == false) {
                System.out.println(i);
            }
        }

    }

    public static boolean [] solution(int m, int n) {

        boolean [] answer = new boolean[n + 1];

        answer[0] = true;
        answer[1] = true;

        for (int i = 2; i < Math.sqrt(n + 1); i++) {
            for (int j = i * i; j < n + 1; j = j + i) {
                answer[j] = true;
            }
        }


        return answer;

    }
}
