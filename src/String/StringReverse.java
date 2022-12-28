package String;

import java.util.ArrayList;

public class StringReverse {

    // 스트링빌더 리버스 함수 이용하여 문자열뒤집기
    public static ArrayList<String> solution(String [] str, int num) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);

        }
        return answer;
    }

    // 문자열을 문자로 변환 후 각각 치환
    public static ArrayList<String> solution2(String [] str, int num) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char [] it = x.toCharArray();
            int lt = 0, rt = it.length - 1;
            while (lt < rt) {
                char temp = it[lt];
                it[lt] = it[rt];
                it[rt] = temp;
                rt--;
                lt++;
            }
            String s = String.valueOf(it);
            answer.add(s);
        }

        return answer;
    }
}
