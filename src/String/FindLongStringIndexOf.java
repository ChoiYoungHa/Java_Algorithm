package String;

public class FindLongStringIndexOf {
    public String findLongString(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, p;
        while((p = str.indexOf(" ")) != -1){
            String temp = str.substring(0, p);
            int len = temp.length();
            if (len > m) {
                m = len;
                answer = temp;
            }
            str = str.substring(p + 1);
        }
        if (str.length() > m) answer = str;

        return answer;
    }
}
