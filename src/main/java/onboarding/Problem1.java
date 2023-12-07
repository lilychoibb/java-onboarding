package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = 0;

        int pobiNum = 0;
        List<Integer> pobiAddNums = new ArrayList<>();
        List<Integer> pobiMultipleNums = new ArrayList<>();

        int pobiAddNum = 0;
        int pobiMultipleNUM = 1;

        for (int number : pobi) {
            pobiAddNum = 0;
            pobiMultipleNUM = 1;
            String numStr = String.valueOf(number);

            for (char c : numStr.toCharArray()) {
                pobiAddNum += Integer.parseInt(String.valueOf(c));
                pobiMultipleNUM *= Integer.parseInt(String.valueOf(c));
            }

            pobiAddNums.add(pobiAddNum);
            pobiMultipleNums.add(pobiMultipleNUM);
        }

        if (Collections.max(pobiAddNums) >= Collections.max(pobiMultipleNums)) {
            pobiNum = Collections.max(pobiAddNums);
        } else {
            pobiNum = Collections.max(pobiMultipleNums);
        }

        int crongNum = 0;
        List<Integer> crongAddNums = new ArrayList<>();
        List<Integer> crongMultipleNums = new ArrayList<>();

        int crongAddNum = 0;
        int crongMultipleNUM = 1;

        for (int number : crong) {
            crongAddNum = 0;
            crongMultipleNUM = 1;
            String numStr = String.valueOf(number);

            for (char c : numStr.toCharArray()) {
                crongAddNum += Integer.parseInt(String.valueOf(c));
                crongMultipleNUM *= Integer.parseInt(String.valueOf(c));
            }

            crongAddNums.add(crongAddNum);
            crongMultipleNums.add(crongMultipleNUM);
        }

        if (Collections.max(crongAddNums) >= Collections.max(crongMultipleNums)) {
            crongNum = Collections.max(crongAddNums);
        } else {
            crongNum = Collections.max(crongMultipleNums);
        }

        if (pobiNum > crongNum) {
            answer = 1;
        } else if (pobiNum == crongNum) {
            answer = 0;
        } else {
            answer = 2;
        }

        if (pobi.get(1) - pobi.get(0) != 1) {
            answer = -1;
        }

        if (crong.get(1) - crong.get(0) != 1) {
            answer = -1;
        }

        return answer;
    }
}