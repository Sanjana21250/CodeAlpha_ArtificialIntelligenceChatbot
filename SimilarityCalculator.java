package com.example.springbootchatbot.service;

public class SimilarityCalculator {

    public static double similarity(String s1, String s2) {

        s1 = NLPProcessor.preprocess(s1);
        s2 = NLPProcessor.preprocess(s2);

        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        int match = 0;

        for (String w1 : words1) {

            for (String w2 : words2) {

                if (w1.equals(w2)) {
                    match++;
                }
            }
        }

        return (double) match /
                Math.max(words1.length, words2.length);
    }
}