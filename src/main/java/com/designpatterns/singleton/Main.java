package com.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        RegularCache regularCache1 = new RegularCache();
        RegularCache regularCache2 = new RegularCache();

        regularCache1.setRegularCache("regularCache1", "Joao");
        System.out.println("NO DESIGN PATTERN HERE");
        System.out.println(regularCache1.getCache().get("regularCache1"));// Joao
        System.out.println(regularCache2.getCache().get("regularCache1")); //null
        System.out.println("SINGLETON DESIGN BEING USED BELOW");

        SingletonCache singletonCache = SingletonCache.getInstance();
        SingletonCache singletonCache2 = SingletonCache.getInstance();
        singletonCache.setSingletonCache("singletonCache", "Maria");
        System.out.println(singletonCache.getCache().get("singletonCache")); //Maria
        System.out.println(singletonCache2.getCache().get("singletonCache"));// Jose

    }
}
