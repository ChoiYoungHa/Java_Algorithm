package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int[] moves = new int[k];
        for (int i = 0; i < k; i++) {
            moves[i] = sc.nextInt();
        }
        ex_01 ex = new ex_01();
        System.out.print(ex.solution(arr, moves));
    }

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int x : moves) {
            int pos = x - 1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos] != 0) {
                    int temp = board[i][pos];
                    board[i][pos] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }else{
                        stack.push(temp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
