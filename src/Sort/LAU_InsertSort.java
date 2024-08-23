package Sort;

import java.util.Scanner;

public class LAU_InsertSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // 사이즈
        int x = sc.nextInt(); // 입력값
        int [] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        LAU_InsertSort ab = new LAU_InsertSort();
        int[] solution = ab.solution(size, arr);
        for (int v : solution) {
            System.out.print(v + " ");
        }
    }

    public int [] solution(int size, int [] arr){

        int[] answer = new int[size];

        int hit = -1;
        for (int x : arr) {
            for (int i = 0; i < size; i++) {
                // 1.hit가 된다면?
                if (answer[i] == x) hit = i;
            }
            if (hit != -1) {
                for (int i = hit; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }else {
                for (int i = size - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            hit = -1;
            answer[0] = x;
        }
        return answer;
    }
}
