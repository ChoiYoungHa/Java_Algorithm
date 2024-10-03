package Mission;

import java.util.HashMap;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String countNumber = sc.nextLine();

        ex02 ex02 = new ex02();
        HashMap<Character, Integer> solution = ex02.solution(countNumber.replaceAll("\\s",""));

        solution.forEach((key, value) -> {
            System.out.println(key + ":" + value + "개");
        });
    }

    public HashMap<Character, Integer> solution(String countNumber){
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : countNumber.toCharArray()) {
            if (!map.containsKey(x)){
                map.put(x, 1);
            }else{
                map.put(x, map.get(x) + 1);
            }
        }

        return map;
    }
}
