package ru.andreev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAlgorithms {

    @Test
    void testBinarySearch() {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numbers2 = List.of(4, 5, 6, 7, 8, 9, 10, 11, 12);

        Integer result1 = Algorithm.binarySearch(numbers1, 11);
        Assertions.assertNull(result1);

        Integer result2 = Algorithm.binarySearch(numbers1, 3);
        Assertions.assertEquals(2, result2);

        Integer result3 = Algorithm.binarySearch(numbers2, 2);
        Assertions.assertNull(result3);

        Integer result4 = Algorithm.binarySearch(numbers2, 11);
        Assertions.assertEquals(7, result4);
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

    @Test
    void testFactorial() {
        int factorial5 = Algorithm.factorial(5);
        int factorial3 = Algorithm.factorial(3);

        Assertions.assertEquals(120, factorial5);
        Assertions.assertEquals(6, factorial3);
    }
}
