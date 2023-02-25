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

    @Test
    void tetSum() {
        int[] arr1 = new int[]{4, 9, 1, 12};
        int sum1 = Algorithm.sum(arr1);

        Assertions.assertEquals(26, sum1);

        int[] arr2 = new int[]{15, 3, 8, 11};
        int sum2 = Algorithm.sum(arr2);

        Assertions.assertEquals(37, sum2);
    }

    @Test
    void testCountElements() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 5, 6, 3, 7, 3, 5, 2, 6));
        int count1 = Algorithm.countElements(list1);

        Assertions.assertEquals(9, count1);

        List<Integer> list2 = new ArrayList<>(List.of(1, 5, 6, 3, 7, 2, 6, 8));
        int count2 = Algorithm.countElements(list2);

        Assertions.assertEquals(8, count2);

        List<Integer> list3 = new ArrayList<>();
        int count3 = Algorithm.countElements(list3);

        Assertions.assertEquals(0, count3);

        List<Integer> list4 = new ArrayList<>(List.of(1));
        int count4 = Algorithm.countElements(list4);

        Assertions.assertEquals(1, count4);
    }

    @Test
    void testFindGreatestNum() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 5, 6, 3, 7, 3, 5, 2, 6));
        Integer count1 = Algorithm.findGreatestNum(list1);

        Assertions.assertEquals(7, count1);

        List<Integer> list2 = new ArrayList<>(List.of(1, 5, 6, 3, 7, 2, 6, 8));
        Integer count2 = Algorithm.findGreatestNum(list2);

        Assertions.assertEquals(8, count2);

        List<Integer> list3 = new ArrayList<>(List.of(8));
        Integer count3 = Algorithm.findGreatestNum(list3);

        Assertions.assertEquals(8, count3);

        Integer count4 = Algorithm.findGreatestNum(new ArrayList<>());

        Assertions.assertNull(count4);
    }

    @Test
    void testQuickSort() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 5, 6, 3, 7, 3, 5, 2, 6));
        List<Integer> listCompare = new ArrayList<>(List.of(1, 2, 3, 3, 5, 5, 6, 6, 7));
        List<Integer> sortList1 = Algorithm.quickSort(list1);

        Assertions.assertEquals(listCompare, sortList1);

        List<Integer> list2 = new ArrayList<>(List.of(1));
        List<Integer> sortList2 = Algorithm.quickSort(list2);

        Assertions.assertEquals(list2, sortList2);

        List<Integer> list3 = new ArrayList<>();
        List<Integer> sortList3 = Algorithm.quickSort(list3);

        Assertions.assertEquals(list3, sortList3);
    }
}
