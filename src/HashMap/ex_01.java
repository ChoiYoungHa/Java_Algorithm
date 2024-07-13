package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String vote = sc.nextLine();
        ex_01 ex = new ex_01();
        System.out.print(ex.solution(n, vote));
    }

    public char solution(int n, String vote) {
        HashMap<Character, Integer> map = new HashMap<>();
        char answer = ' ';
        for (char x : vote.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int max = 0;
        for (char key : map.keySet()){
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}
