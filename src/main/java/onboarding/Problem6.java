package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> tempAnswerName = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        for (List<String> name : forms) {
            names.add(name.get(1));
        }

        int sameLetterCount = 0;
        List<Integer> sameLetterIndex = new ArrayList<>();

        for (String name : names) {
            for (int i = 0; i < names.size(); i++) {

                sameLetterCount = 0;
                sameLetterIndex.clear();

                if (Objects.equals(names.get(i), name)) {
                    continue;
                }

                for (char c : name.toCharArray()) {
                    boolean sameLetter = names.get(i).contains(String.valueOf(c));

                    if (sameLetter) {
                        sameLetterIndex.add(names.get(i).indexOf(c));
                        sameLetterCount++;

                        if (sameLetterCount == 2) {
                            if (sameLetterIndex.get(1) - sameLetterIndex.get(0) == 1) {
                                tempAnswerName.add(names.get(i));
                            }
                        }
                    }
                }
            }
        }

        for (String name : tempAnswerName) {
            for (List<String> email : forms) {
                if (email.get(1).equals(name)) {
                    if (!answer.contains(email.get(0))) {
                        answer.add(email.get(0));
                    }
                }
            }
        }

        Collections.sort(answer);

        return answer;
    }
}