package Array;

public class Eratosthenes {
    public static int solution(int data) {

        int  answer = 0;
        int[] arr = new int[data + 1];

        for (int i = 2; i <= data; i++) {
            if (arr[i] == 0) {
                answer++;
            }
            for (int j = i; j <= data; j = j + i) {
                arr[j] = 1;
            }
        }

        return answer;

    }
}
