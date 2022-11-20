package com.sda.lupdumitru.advanced.coding.collections.ex5;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {
    private final Map<String, List<String>> mapStorage = new HashMap<>();

    public void addToStorage(String key, String value) {
        if (mapStorage.containsKey(key)) {
            List<String> values = mapStorage.get(key);
            values.add(value);
            mapStorage.put(key, values);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            mapStorage.put(key, values);
        }

    }

    public void printValues(String key) {
        List<String> values = mapStorage.get(key);
        if (values == null) {
            System.out.println("No values for key : " + key);
        } else {
            System.out.println("Values for key " + key + " are : " + values);
        }
    }


    public Set<String> findKeys(String value) {
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : mapStorage.entrySet()) {
            if (entry.getValue().contains(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public Set<String> findKeysWithStreams(String value) {
        return mapStorage.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
    }

}
