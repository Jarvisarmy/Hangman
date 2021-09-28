package com.company;

import java.util.Collections;

public class Animals extends Category{

    public Animals() {
        super();
        this.words.add("Cat");
        this.words.add("Dog");
        this.words.add("Turtle");
        this.words.add("Tiger");
        this.words.add("Kangaroo");
        Collections.shuffle(this.words);
    }

    @Override
    public String nextWord() {
        this.curLevel = this.curLevel + 1;
        System.out.println("Currently level: " + (this.curLevel+1));
        return this.words.get(this.curLevel);
    }

}
