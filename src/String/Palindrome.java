package String;

public class Palindrome {


    // 입력받은 String이 회문이면 YES 아니면 NO
    public static String solution(String  str) {
        String answer = "YES";
        str = str.toUpperCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return "NO";
            }
        }
        return answer;
    }

    // 특수문자가 섞인 문자열이 팰린드롬인지 아닌지 확인
    public static String solution2(String  str) {
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();
        if (!str.equals(temp)){
            return "NO";
        }
        return answer;
    }


}
