package com.designpatterns.singleton;

import java.util.HashMap;

public class CacheService implements  ICache {
    private HashMap<String,String> cache;

    public CacheService(HashMap<String, String> cache) {
        this.cache = cache;
    }

    @Override
    public void setCache(String key, String value) {

    }

    @Override
    public String getCache(String key) {
        return "";
    }
}
