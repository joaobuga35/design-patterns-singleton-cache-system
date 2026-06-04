package com.designpatterns.singleton;

import java.util.HashMap;

public class ServiceLocator {

    private static ServiceLocator instance;
    private HashMap<String, String> services;

    private ServiceLocator() {
        this.services = new HashMap<>();
    }

    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }

    public void register(String name, String service) {
        this.services.put(name, service);
    }

    public String getService(String name) {
        if(!this.services.containsKey(name)) {
            throw new RuntimeException("Service not found: " + name);
        }
        return this.services.get(name);
    }
}
