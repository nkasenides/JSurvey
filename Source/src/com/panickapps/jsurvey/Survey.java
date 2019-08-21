package com.panickapps.jsurvey;

public class Survey {

    private MovableItemList<Question> questionList = new MovableItemList<>();

    public MovableItemList<Question> getQuestionList() {
        return questionList;
    }

}
