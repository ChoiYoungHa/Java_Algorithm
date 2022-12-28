import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] data = new String[num];
        for (int i = 0; i < num; i++) {
            data[i] = sc.next();
        }

        for (String x : solution(data, num)) {
            System.out.println(x);
        }
    }

    public static ArrayList<String> solution(String [] str, int num) {
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
}
