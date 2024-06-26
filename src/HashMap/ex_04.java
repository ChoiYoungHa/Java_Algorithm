package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        ex_04 ex = new ex_04();
        ex.solution(s, t);
    }

    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arry = s.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            map.put(arry[i], map.getOrDefault(arry[i], 0) + 1);
        }
        // lt, rt 슬라이딩 윈도우로 bac, aca, caA 이런식으로 밀고 나가면서 요소가 바뀔 때마다 t와 키값 비교해서 하나라도 틀리면 false
        // 맞으면 answer + 1; 하면 될듯? 채영이 만나러가자.

        return answer;
    }
}
