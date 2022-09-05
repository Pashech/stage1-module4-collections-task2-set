package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();

        for (Integer i : sourceList) {
            set.add(i * i);
        }

        NavigableSet<Integer> navigableSet = new TreeSet<>(set);
        set.clear();
        set = navigableSet.subSet(lowerBound, true, upperBound, true);
        System.out.println(set);

        return set;
    }
}
