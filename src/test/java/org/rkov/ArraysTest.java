package org.rkov;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class ArraysTest {

    @Test
    public void successCountOfElements() {
        List<String> list = List.of("Tom", "jerry", "bob", "jerry", "bob", "jerry");

        Map<String, Integer> map = Arrays.countOfElements(list);

        Assert.assertTrue(map.get("jerry") == 3);
    }

    @Test
    public void emptyList() {
        List<String> list = List.of();

        Map<String, Integer> map = Arrays.countOfElements(list);

        Assert.assertTrue(map.isEmpty());
    }
}
