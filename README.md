# CodeAlpha_ArtificialIntelligenceChatbot
# AI Chatbot using Spring Boot

A simple AI-based FAQ Chatbot built using Java and Spring Boot.
This project uses basic NLP preprocessing and keyword similarity matching to generate chatbot responses from predefined FAQ data.

---

## Features

* Built with Java + Spring Boot
* Simple NLP text preprocessing
* FAQ-based chatbot responses
* REST API support
* Frontend chat UI using HTML, CSS, and JavaScript
* CSV-based training data
* Beginner-friendly project

---

## Tech Stack

* Java 17
* Spring Boot
* HTML
* CSS
* JavaScript
* Maven

---

## Project Structure

```bash
springbootchatbot/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/springbootchatbot/
│   │   │   ├── controller/
│   │   │   │   └── ChatController.java
│   │   │   ├── service/
│   │   │   │   ├── ChatbotEngine.java
│   │   │   │   ├── FAQTrainer.java
│   │   │   │   ├── NLPProcessor.java
│   │   │   │   └── SimilarityCalculator.java
│   │   │   └── SpringbootchatbotApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   ├── style.css
│   │       │   └── script.js
│   │       └── application.properties
│
├── faq.csv
└── pom.xml
```

---

## How It Works

1. User enters a message in the chat UI.
2. The frontend sends the message to the Spring Boot backend.
3. Backend preprocesses the text using NLP techniques.
4. Similarity matching checks the FAQ dataset.
5. Best matching response is returned to the user.

---

### Open Project

Open the project in:

* IntelliJ IDEA
* VS Code
* Eclipse

---

### Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run:

```bash
SpringbootchatbotApplication.java
```

---

## Open in Browser

After running the application:

```bash
http://localhost:8080
```

---

## Future Improvements

* Add Machine Learning model
* Use database instead of CSV
* Add voice chatbot support
* Improve NLP processing
* Add authentication system
* Deploy on cloud platform
