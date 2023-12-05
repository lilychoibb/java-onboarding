package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        int[] gameNumber = new int[]{3, 6, 9};

        for (int i = 0; i < number + 1; i++) {
            String[] num = String.valueOf(i).split("");
            for (int gameNum : gameNumber) {
                for (String numb : num) {
                    if (gameNum == Integer.parseInt(numb)) {
                        answer += 1;
                    }
                }

            }
        }

        return answer;
    }
}
