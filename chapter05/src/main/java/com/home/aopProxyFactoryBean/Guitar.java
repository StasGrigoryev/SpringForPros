package com.home.aopProxyFactoryBean;

public class Guitar {

    private String brand = "Martin";

    public String play() {
        return "on guitar: Am Dm C G";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
