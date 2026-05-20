package com.example.springbootchatbot.service;

public class NLPProcessor {

    public static String preprocess(String text) {

        text = text.toLowerCase();

        text = text.replaceAll("[^a-zA-Z ]", "");

        return text.trim();
    }
}