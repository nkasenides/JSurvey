package com.panickapps.jsurvey;

public class Test {

    public static void main(String[] args) {
        Survey survey = new Survey();
        survey.getQuestionList().add(new OpenEndedQuestion("Question 1"));
        survey.getQuestionList().add(new OpenEndedQuestion("Question 2"));
        survey.getQuestionList().add(new OpenEndedQuestion("Question 3"));
        survey.getQuestionList().add(new OpenEndedQuestion("Question 4"));

        survey.getQuestionList().moveToEnd(0);

        for (Question q : survey.getQuestionList()) {
            System.out.println(q.questionText);
        }

    }

}
