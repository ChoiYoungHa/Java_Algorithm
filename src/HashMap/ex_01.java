package HashMap;

import com.sun.jdi.Value;

import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String vote = sc.nextLine();
        ex_01 ex = new ex_01();
        System.out.print(ex.solution(n, vote));
    }

    public Character solution(int n, String vote) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : vote.toCharArray()) {
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else map.put(i, 1);
        }

        int max = 0;
        Character answer = null;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max){
                max = entry.getValue();
                answer = entry.getKey();
            }
        }

        return answer;
    }
}
