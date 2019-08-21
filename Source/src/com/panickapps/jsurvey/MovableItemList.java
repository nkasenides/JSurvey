package com.panickapps.jsurvey;

import java.util.ArrayList;

public class MovableItemList<Item> extends ArrayList<Item> {

    public void move(int sourceIndex, int destinationIndex) {
        final Item movedQuestion = remove(sourceIndex);
        add(destinationIndex, movedQuestion);
    }

    public void moveToStart(int sourceIndex) {
        final Item movedQuestion = remove(sourceIndex);
        add(0, movedQuestion);
    }

    public void moveToEnd(int sourceIndex) {
        final Item movedQuestion = remove(sourceIndex);
        add(movedQuestion);
    }

}
