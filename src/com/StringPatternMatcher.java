package com;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringPatternMatcher {
    public static boolean isPatternMatch(String pattern, String value) {
        String regex = pattern.replace("*", ".*");
        return Pattern.matches(regex, value);
    }

    public static boolean containsMatchingPattern(List<String> patterns, String value) {
        for (String pattern : patterns) {
            if (isPatternMatch(pattern, value)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> patternList = new ArrayList<>();
        patternList.add("en*");
        patternList.add("xyz");

        String valueToCheck = "en_";

        boolean isMatch = containsMatchingPattern(patternList, valueToCheck);

        if (isMatch) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found.");
        }
    }
}

