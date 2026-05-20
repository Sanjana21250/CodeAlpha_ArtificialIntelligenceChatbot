package com.example.springbootchatbot.service;

import java.io.*;
import java.util.*;

public class FAQTrainer {

    private Map<String, String> faqMap = new HashMap<>();

    public FAQTrainer() {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("faq.csv"));

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                faqMap.put(parts[0], parts[1]);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> getFAQMap() {
        return faqMap;
    }
}