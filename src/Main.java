import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> solution = solution(arr);
        for (int x : solution) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solution(int [] m) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m.length; i++) {
            int res = 0;
            int temp = m[i];
            while(temp > 0){
                int t = temp % 10; // 끝값 추출
                res = res * 10 + t; // 이해 안 됨 뒤집는거같긴한데 기억안남
                temp = temp / 10; // temp가 0이될 때까지
            }
            if (isPrime(res)) list.add(res);
        }
        return list;
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
