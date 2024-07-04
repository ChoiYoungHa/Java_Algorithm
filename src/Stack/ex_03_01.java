package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ex_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ex_03_01 ex = new ex_03_01();
        System.out.print(ex.solution(s));
    }

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for (char x : s.toCharArray()) {
            if (x == ')'){
                while(stack.pop() != '(');
            }
            else stack.push(x);
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
