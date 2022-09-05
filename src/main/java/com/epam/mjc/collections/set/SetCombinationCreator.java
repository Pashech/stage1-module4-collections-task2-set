package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();

        for (String s : firstSet) {
            if (secondSet.contains(s)) {
                resultSet.add(s);
            }
        }

        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);

        resultSet.addAll(thirdSet);

        return resultSet;
    }
}
