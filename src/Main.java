import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String data = sc.next();
        String solution = solution(data, num);
        System.out.println(solution);
    }

    public static String solution(String str, int num) {
        String answer = "";
        String temp = "";

        for (int i = 0; i < num; i++) {
            temp = str.replace('*', '0').replace('#','1').substring(0,7);
            int ten = Integer.parseInt(temp, 2);
            answer += (char) ten;
            str = str.substring(7);
        }

        return answer;
    }
}
