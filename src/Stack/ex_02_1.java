package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ex_02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ex_02_1 ex = new ex_02_1();
        System.out.println(ex.solution(s));
    }

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String answer = "YES";

        for (char x : s.toCharArray()) {
            if (x == '(') stack.push(x);
            else{
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }
}
