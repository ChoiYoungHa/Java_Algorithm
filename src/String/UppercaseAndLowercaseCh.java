package String;

import java.util.Locale;

public class UppercaseAndLowercaseCh {
    public String upperCaseAndLowerCaseCh(String data) {
        String answer = "";
        for (char x : data.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer += Character.toLowerCase(x);
            }else{
                answer += Character.toUpperCase(x);
            }
        }
        return answer;
    }
}
