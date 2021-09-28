package com.company;
import java.util.*;
public abstract class Category {

    protected ArrayList<String> words = new ArrayList<String>();
    protected int curLevel = -1;

    public Category() {

    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public int getCurLevel() {
        return curLevel;
    }

    public void setCurLevel(int curLevel) {
        this.curLevel = curLevel;
    }

    public abstract String nextWord();
}
