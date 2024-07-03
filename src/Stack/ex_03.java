package Stack;


import java.util.Scanner;
import java.util.Stack;

public class ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ex_03 ex = new ex_03();
        System.out.print(ex.solution(s));
    }

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (char x : s.toCharArray()) {
            stack.push(x);
            if (x == ')'){
                while(!(stack.peek() == '(')) stack.pop();
                stack.pop();
            }
        }
        for (char x : stack) {
            st.append(x);
        }

        return st.toString();
    }
}
