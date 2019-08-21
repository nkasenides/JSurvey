package com.panickapps.jsurvey;

public abstract class Question<Answer> {

    protected final String questionText;
    protected Answer answer;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {

    }

}
