package com.company;

import java.util.Collections;

public class Buildings extends Category{

    public Buildings() {
        super();
        this.words.add("hospital");
        this.words.add("clinic");
        this.words.add("police station");
        this.words.add("school");
        this.words.add("dormitory");
        Collections.shuffle(this.words);
    }

    @Override
    public String nextWord() {
        this.curLevel = this.curLevel + 1;
        System.out.println("Currently level: " + (this.curLevel+1));
        return this.words.get(this.curLevel);
    }

}
