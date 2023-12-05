package onboarding;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        StringBuilder answer = new StringBuilder();
        Map<Character, Character> map = createLetterMapping();

        for (char c : word.toCharArray()) {
            if (map.containsKey(c)) {
                answer.append(map.get(c));
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }

    private static Map<Character, Character> createLetterMapping() {
        Map<Character, Character> map = new HashMap<>();

        char startChar = 'A';
        char endChar = 'Z';

        for (char currentChar = startChar; currentChar <= endChar; currentChar++) {
            char mirroredChar = (char) ('Z' - (currentChar - 'A'));
            map.put(currentChar, mirroredChar);
            map.put(Character.toLowerCase(currentChar), Character.toLowerCase(mirroredChar));
        }

        return map;
    }
}