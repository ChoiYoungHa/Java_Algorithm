package Stack;

import org.w3c.dom.html.HTMLOptGroupElement;

import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ex_05 ex = new ex_05();
        System.out.println(ex.solution(s));
    }
    
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(s.charAt(i));
            else {
                stack.pop();
                if (s.charAt(i-1) == '(') answer += stack.size();
                else answer += 1;
            }
        }
        return answer;
    }
    
    
}
