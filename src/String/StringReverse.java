package String;

import java.util.ArrayList;

public class StringReverse {

    // 스트링빌더 리버스 함수 이용하여 문자열뒤집기
    public static ArrayList<String> solution(String [] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);

        }
        return answer;
    }

    // 문자열을 문자로 변환 후 각각 치환
    public static ArrayList<String> solution2(String [] str) {
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

    // 특수문자를 제외하고 문자열 뒤집기
    public static String solution3(String  str) {
        String answer = "";
        char [] s = str.toCharArray();
        int lt = 0, rt = s.length -1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
}
