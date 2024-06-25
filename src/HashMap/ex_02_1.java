package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ex_02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        ex_02_1 ex = new ex_02_1();
        System.out.print(ex.solution(a, b));
    }

    public String solution(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }
        return "YES";
    }
}
