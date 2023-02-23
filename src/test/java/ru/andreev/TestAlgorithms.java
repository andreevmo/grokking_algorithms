package ru.andreev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAlgorithms {

    @Test
    void testBinarySearch() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer result1 = Algorithm.binarySearch(numbers, 11);
        Assertions.assertNull(result1);

        Integer result2 = Algorithm.binarySearch(numbers, 3);
        Assertions.assertEquals(2, result2);
    }

    @Test
    void testSelectionSort() {
        List<Integer> numbers = new ArrayList<>(
                List.of(9, 3, 4, 8, 1, 5, 7, 2, 6)
        );
        List<Integer> compareResult = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers = Algorithm.selectionSort(numbers);

        Assertions.assertEquals(compareResult, numbers);
    }
}
