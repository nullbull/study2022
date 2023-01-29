package com.github.leetcode.string;

import com.github.leetcode.sort.HeapSort;
import java.util.HashMap;
import java.util.Map;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.27
 */
public class A290单词规律 {

    public boolean wordPattern(String pattern, String s) {
        String[] letters = s.split(" ");
        if (letters.length % pattern.length() != 0) {
            return false;
        }
        Map<String, Character> map = new HashMap<>();
        Map<Character, String> mapB = new HashMap<>();
        for (int j = 0; j < pattern.length(); j++) {
            String word = letters[j];
            Character character = map.get(word);
            if (character == null) {
                if (mapB.containsKey(pattern.charAt(j))) {
                    return false;
                }
                map.put(word, pattern.charAt(j));
                mapB.put(pattern.charAt(j), word);
            }
        }
        for (int i = 0; i < letters.length; i += pattern.length()) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < pattern.length(); j++) {
                sb.append(map.get(letters[j]));
            }
            if (!sb.toString().equals(pattern)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new A290单词规律().wordPattern(
                "abba",
                "dog cat cat dog");
    }
}
