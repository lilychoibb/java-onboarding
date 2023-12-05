package onboarding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Problem2 {
    public static String solution(String cryptogram) {
        StringBuilder answer = new StringBuilder();

        List<String> splitCryptogram = new ArrayList<>(List.of(cryptogram.split("")));

        int size;

        do {
            size = splitCryptogram.size();
            int i = 1;

            while (i < splitCryptogram.size()) {
                if (Objects.equals(splitCryptogram.get(i), splitCryptogram.get(i - 1))) {
                    splitCryptogram.remove(i);
                    splitCryptogram.remove(i - 1);
                } else {
                    i++;
                }
            }
        } while (size != splitCryptogram.size());

        for (String s : splitCryptogram) {
            answer.append(s);
        }

        return answer.toString();
    }
}
