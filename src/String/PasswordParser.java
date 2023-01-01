package String;

public class PasswordParser {
    public static String solution(String str, int num) {
        String answer = "";
        String temp = "";


        for (int i = 0; i < num; i++) {
            temp = str.replace("*", "0").replace("#", "1").substring(0, 7);
            int ten = Integer.parseInt(temp, 2);
            answer += (char) ten;
            str = str.substring(7);
        }

        return answer;
    }
}
