package com.company;
import java.util.*;
public class Sports extends Category{

    public Sports() {
        super();
        this.words.add("basketball");
        this.words.add("football");
        this.words.add("swimming");
        this.words.add("running");
        this.words.add("fitness");
        Collections.shuffle(this.words);
    }

    @Override
    public String nextWord() {
        this.curLevel = this.curLevel + 1;
        System.out.println("Currently level: " + (this.curLevel+1));
        return this.words.get(this.curLevel);
    }

}
