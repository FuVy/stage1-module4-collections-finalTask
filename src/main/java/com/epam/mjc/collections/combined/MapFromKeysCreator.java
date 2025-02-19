package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String word : sourceMap.keySet()) {
            Integer value = sourceMap.get(word);
            if (map.containsKey(word.length())) {
                var set = map.get(word.length());
                set.add(word);
            } else {
                Set<String> newSet = new HashSet<>();
                newSet.add(word);
                map.put(word.length(), newSet);
            }
        }
        return map;
    }
}
