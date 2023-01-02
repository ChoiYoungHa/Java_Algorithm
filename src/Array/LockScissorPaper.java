package Array;

public class LockScissorPaper {

    // 가위바위보 풀이는 자신을 기준으로 이기고 지고를 비교해야함.
    public static String solution(int [] numList, int [] numList2) {
        String answer = "";

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] == numList2[i]){
                answer += "D";
            } else if (numList[i] == 1 && numList2[i] == 3) {
                answer += "A";
            } else if (numList[i] == 2 && numList2[i] == 1) {
                answer += "A";
            } else if (numList[i] == 3 && numList2[i] == 2) {
                answer += "A";
            }else{
                answer += "B";
            }
        }
        return answer;
    }
}
