package ru.andreev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestAlgorithms {

    @Test
    void testBinarySearch() {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        Integer result1 = Algorithm.binarySearch(numbers, 11);
        Assertions.assertNull(result1);

        Integer result2 = Algorithm.binarySearch(numbers, 3);
        Assertions.assertEquals(2, result2);
    }
}
