package org.rkov;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arrays {

    public static <T> Map<T, Integer> countOfElements(List<T> list) {
        Map<T, Integer> result = new HashMap<>();

        for (T element : list) {
            int count = result.getOrDefault(element, 0);
            result.put(element, count + 1);
        }

        return result;
    }
}
