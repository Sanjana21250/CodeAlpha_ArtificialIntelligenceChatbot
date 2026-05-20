package com.example.springbootchatbot.service;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class ChatbotEngine {

    private FAQTrainer trainer = new FAQTrainer();

    public String getResponse(String input) {

        input = NLPProcessor.preprocess(input);

        Map<String, String> faqMap =
                trainer.getFAQMap();

        double bestScore = 0;

        String bestResponse =
                "Sorry, I don't understand.";

        for (String question : faqMap.keySet()) {

            double score =
                    SimilarityCalculator.similarity(
                            input,
                            question
                    );

            if (score > bestScore) {

                bestScore = score;

                bestResponse = faqMap.get(question);
            }
        }

        return bestResponse;
    }
}