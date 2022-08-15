package com.home.chapter04.messageDigestFactoryBeanWithMethod;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestFactoryWithMethod {
    private String algorithmName = "MD5";

    public MessageDigest createInstance() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(algorithmName);
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
}
