package ex02_if;

public class ex_05 {
    public static int solution(int n, String control) {

        for (char i : control.toCharArray()) {
            if (i == 'w'){
                n += 1;
            } else if (i == 's') {
                n -= 1;
            } else if (i == 'd') {
                n += 10;
            }else if (i == 'a'){
                n -= 10;
            }
        }
        return n;
    }
}
