package Array;

public class BiggerNumber {
    // 보이는 학생 문제
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
