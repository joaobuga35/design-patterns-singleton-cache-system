package com.designpatterns.singleton;

import java.util.HashMap;

public class RegularCache {
    private HashMap<String, Object> cache;

    public RegularCache() {
        this.cache = new HashMap<>(cache);
    }

    public void setRegularCache(String key, Object value) {

    }
}
