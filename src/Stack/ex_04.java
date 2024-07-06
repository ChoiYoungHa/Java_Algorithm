package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ex_04 ex = new ex_04();
        System.out.println(ex.solution(s));
    }

    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else if (x == '+'){
                int rt = stack.pop();
                int lt = stack.pop();
                stack.push(lt + rt);
            }else if (x == '*'){
                int rt = stack.pop();
                int lt = stack.pop();
                stack.push(lt * rt);
            }else if (x == '-'){
                int rt = stack.pop();
                int lt = stack.pop();
                stack.push(lt - rt);
            }else if (x == '/'){
                int rt = stack.pop();
                int lt = stack.pop();
                stack.push(lt / rt);
            }
        }
        return stack.get(0);
    }
}
