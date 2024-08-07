package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ex_02 ex = new ex_02();
        System.out.println(ex.solution(s));
    }

    public String solution(String s) {
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        stack.push(charArray[0]);

        for (int i = 1; i < charArray.length; i++) {
            if (!stack.isEmpty() && stack.peek() == '(' && charArray[i] == ')'){
                stack.pop();
            } else stack.push(charArray[i]);
        }

        if (stack.isEmpty()) return "YES";
        return answer;
    }
}
