import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] numList = new int[num];
        for (int i = 0; i < num; i++) {
            numList[i] = sc.nextInt();
        }

        int res = solution(numList);
        System.out.println(res);

    }

    public static int solution(int [] numList) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] > max){
                answer++;
                max = numList[i];
            }
        }
        return answer;
    }
}
