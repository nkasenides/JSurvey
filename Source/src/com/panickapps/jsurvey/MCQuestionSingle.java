package com.panickapps.jsurvey;

import java.util.ArrayList;
import java.util.Collections;

public abstract class MCQuestionSingle extends Question<MCOption> {

    private MovableItemList<MCOption> options;

    public MCQuestionSingle(String questionText) {
        super(questionText);
        options = new MovableItemList<>();
    }

    public MovableItemList<MCOption> getShuffledOptions() {
        if (options.size() > 0) {
            MovableItemList<MCOption> returnedOptions = new MovableItemList<>();
            Collections.copy(options, returnedOptions);
            Collections.shuffle(returnedOptions);
            return returnedOptions;
        }
        else return options;
    }

    public MovableItemList<MCOption> getOptions() {
        return options;
    }

}
