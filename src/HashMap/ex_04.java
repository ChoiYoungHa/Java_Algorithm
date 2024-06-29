package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        ex_04 ex = new ex_04();
        System.out.print(ex.solution(s, t));
    }

    public int solution(String s, String t) {
        char[] charArray = s.toCharArray();
        int lt = 0;
        int answer = 0;
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        // 슬라이딩 윈도우 세팅 1개전까지
        for (int i = 0; i < t.length() - 1; i++) {
            s_map.put(charArray[i], s_map.getOrDefault(charArray[i], 0) + 1);
        }

        // 비교할 아나그램 hashmap에 넣기
        for (char x : t.toCharArray()) {
            t_map.put(x, t_map.getOrDefault(x, 0) + 1);
        }


        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            s_map.put(charArray[rt], s_map.getOrDefault(charArray[rt], 0) + 1);
            if (s_map.equals(t_map)) answer += 1;

            s_map.put(charArray[lt], s_map.get(charArray[lt]) - 1);
            if (s_map.get(charArray[lt]) == 0) s_map.remove(charArray[lt]);
            lt++;
        }
        return answer;

    }
}
