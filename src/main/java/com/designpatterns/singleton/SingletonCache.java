package com.designpatterns.singleton;

import java.util.HashMap;
import java.util.Objects;

public class SingletonCache {
    private static SingletonCache instance;
    private HashMap<String, String> cache;

    private SingletonCache() {
        this.cache = new HashMap<>();
    }

   public static SingletonCache getInstance() {
        if (instance == null) {
            instance = new SingletonCache();
        }
        return instance;
   }

    public void setSingletonCache(String key, String value) {
        this.cache.put(key, value);
    }

    public String getRegularObject(String key) {
        return this.cache.get(key);
    }


    public HashMap<String, String> getCache() {
        return cache;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SingletonCache that = (SingletonCache) o;
        return Objects.equals(cache, that.cache);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cache);
    }
}
