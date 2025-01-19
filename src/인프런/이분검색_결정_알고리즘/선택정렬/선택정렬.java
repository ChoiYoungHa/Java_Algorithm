package 인프런.이분검색_결정_알고리즘.선택정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 선택정렬 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = 선택정렬.select_sort(array);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
    public static int[] select_sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int k = i + 1; k < array.length; k++) {
                if (min > array[k]) {
                    min = array[k];
                    int tmp = array[i];
                    array[i] = array[k];
                    array[k] = tmp;
                }
            }
        }
        return array;
    }
}
