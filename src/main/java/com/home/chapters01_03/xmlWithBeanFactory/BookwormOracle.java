package com.home.chapters01_03.xmlWithBeanFactory;

public class BookwormOracle implements Oracle {
    Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
        return "Stop wasting you money on Encyclopedia - go " +
                "see the wold instead.";
    }


}
