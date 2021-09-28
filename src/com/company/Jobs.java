package com.company;

import java.util.Collections;

public class Jobs extends Category{

    public Jobs() {
        super();
        this.words.add("engineering");
        this.words.add("product manager");
        this.words.add("artist");
        this.words.add("computer technician");
        this.words.add("telemarketer");
        Collections.shuffle(this.words);
    }

    @Override
    public String nextWord() {
        this.curLevel = this.curLevel + 1;
        System.out.println("Currently level: " + (this.curLevel+1));
        return this.words.get(this.curLevel);
    }

}
