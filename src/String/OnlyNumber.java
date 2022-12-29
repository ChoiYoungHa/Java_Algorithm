package String;

public class OnlyNumber {
    // 문자와 숫자가 섞여있는 문자열에서 숫자만 추출
    public static String solution(String str) {
        String answer = "YES";
        str = str.replaceAll("[^0-9]", "");
        Integer result = Integer.valueOf(str);
        answer = String.valueOf(result);

        return answer;
    }
}
