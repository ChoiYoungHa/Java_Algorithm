package Stream;

import java.io.BufferedReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Test t = new Test();
        t.solution(x, y);
    }

    public void solution(int x, int y) {
        for (int i = 1; i <= x * y; i++) {
            if (i % x == 0) {
                if (i % y == 0){
                    System.out.print(3);
                } else System.out.print(2);
            } else if (i % y == 0) {
                System.out.print(1);
            }
        }
    }
}
