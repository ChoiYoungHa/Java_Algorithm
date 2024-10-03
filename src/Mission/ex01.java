package Mission;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] arr = new char[input.length()];
        arr = input.toCharArray();

        String solution = solution(arr);
        System.out.print(solution);
    }

    public static String solution(char [] arr){
        ArrayList<Character> temp = new ArrayList<>();
        StringBuilder answer = new StringBuilder();


        for (int i = 0; i < arr.length; i++) {
            if (!temp.contains(arr[i])) {
                answer.append(arr[i]);
                temp.add(arr[i]);
            }
        }

        return answer.toString();
    }
}
