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

    }

    public int [] solution(int size, int [] arr){

        return arr;
    }
}
