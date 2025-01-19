package 인프런.스택문제.크레인_인형뽑기_카카오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 인형뽑기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //board
        int n = Integer.parseInt(br.readLine()) + 1; // 1부터 시작
        int [][] board = new int [n][n];

        // board input
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k = 1; k < n; k++) {
                board[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        //moves
        int m = Integer.parseInt(br.readLine()) + 1;

        int[] moves = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        //output
        int solution = 인형뽑기.solution(board, moves, n);
        System.out.print(solution);


    }
    public static int solution(int[][] board, int[] moves, int n) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();

        for (int move : moves) {
            for (int j = 1; j < n; j++) {
                if (board[j][move] != 0) {
                    if (bucket.isEmpty()) {
                        bucket.push(board[j][move]);
                    } else if (bucket.peek() == board[j][move]) {
                        bucket.pop();
                        answer += 2;
                    }else{
                        bucket.push(board[j][move]);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }

}

