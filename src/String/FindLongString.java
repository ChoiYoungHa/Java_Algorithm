package String;

public class FindLongString {
    public String findLongString(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE;

        String[] data = str.split(" ");
        for (String x : data) {
            int m = x.length();
            if (m > min) {
                min = m;
                answer = x;
            }
        }

        return answer;
    }
}
