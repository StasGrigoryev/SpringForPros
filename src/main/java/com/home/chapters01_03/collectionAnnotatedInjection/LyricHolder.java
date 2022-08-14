package com.home.chapters01_03.collectionAnnotatedInjection;

import org.springframework.stereotype.Service;

@Service("lyricHolder")
public class LyricHolder implements ContentHolder {
    private String value="'You be the DJ, I'll be the driver";

    @Override
    public String toString() {
        return "LyricHolder{" +
                "value='" + value + '\'' +
                '}';
    }
}