package com.home.aopNamespace;

import com.home.aopProxyFactoryBean.Documentarist;
import com.home.aopProxyFactoryBean.Guitar;

public class NewDocumentarist extends Documentarist {
    @Override
    public void execute() {
        guitarist.sing();
        Guitar guitar = new Guitar();
        guitar.setBrand("Gibson");
        guitarist.sing(guitar);
        guitar.setBrand("Fender");
        guitarist.sing(guitar);
//        guitarist.sing(new Guitar());
        guitarist.talk();
    }
}
