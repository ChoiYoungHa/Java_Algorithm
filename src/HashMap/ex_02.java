package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        ex_02 ex = new ex_02();
        System.out.print(ex.solution(a, b));
    }

    public String solution(String a, String b) {
        HashMap<Character, Integer> a_map = new HashMap<>();

        String answer = "YES";
        for (char x : a.toCharArray()) {
            a_map.put(x, a_map.getOrDefault(x, 0) + 1);
        }
        HashMap<Character, Integer> b_map = new HashMap<>();

        for (char x : b.toCharArray()) {
            b_map.put(x, b_map.getOrDefault(x, 0) + 1);
        }

        for (char a_key : a_map.keySet()) {
            if (!b_map.containsKey(a_key)) answer = "NO";
            else if (a_map.get(a_key) != b_map.get(a_key)) answer = "NO";
        }

        return answer;
    }
}
