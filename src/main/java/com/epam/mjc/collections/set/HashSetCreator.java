package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet set = new HashSet();

        for (int i = 0; i < sourceList.size(); i++) {
            set.add(sourceList.get(i));
            int temp = 0;
            if (sourceList.get(i) % 2 == 0) {
                temp = sourceList.get(i);
                while (temp % 2 == 0) {

                    temp = temp / 2;
                    set.add(temp);
                }
            } else {
                temp = sourceList.get(i) * 2;
                set.add(temp);
            }
        }
        return set;
    }
}
