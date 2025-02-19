package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (var key : projects.keySet()) {
            for (var dev : projects.get(key)) {
                if (dev.equals(developer)) {
                    list.add(key);
                    break;
                }
            }
        }
        list.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() < o2.length()) {
                return 1;
            } else {
                return o1.compareTo(o2) * -1;
            }
        });
        return list;
    }
}
