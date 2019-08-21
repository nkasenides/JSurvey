package com.panickapps.jsurvey;

public class OpenEndedQuestion extends Question<String> {

    public static final String NO_ANSWER = "No answer";

    protected OpenEndedQuestion(String questionText) {
        super(questionText);
        answer = NO_ANSWER;
    }

}
