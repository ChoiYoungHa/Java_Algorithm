import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        for(int x : solution(data)){
            System.out.print(x + " ");
        }
    }

    public static int [] solution(String str) {
        String [] s = str.split(" ");
        int num = s[0].length();
        int[] answer = new int[num];
        int p = 1000;

        for (int i = 0; i < s[0].length(); i++) {
            if (s[0].charAt(i) == s[1].charAt(0)) {
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        for (int j = s[0].length() - 1; j >= 0 ; j--) {
            if (s[0].charAt(j) == s[1].charAt(0)){
                p = 0;
                answer[j] = p;
            }else {
                p++;
                if (!(answer[j] < p)){
                    answer[j] = p;
                }
            }
        }



        return answer;
    }
}
