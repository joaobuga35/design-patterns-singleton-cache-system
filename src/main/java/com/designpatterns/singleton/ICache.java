package com.designpatterns.singleton;

public interface ICache {
        void setCache(String key, String value);
        String getCache(String key);
}
