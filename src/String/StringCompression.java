package String;

public class StringCompression {
    public static String solution(String str) {
        String answer = "";
        str = str + " ";
        int p = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)){
                p++;
            } else{
                answer += str.charAt(i);
                if (p > 1){
                    answer += String.valueOf(p);
                    p = 1;
                }
            }
        }
        return answer;
    }
}
