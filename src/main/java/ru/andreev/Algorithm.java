package ru.andreev;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

    public static Integer binarySearch(List<Integer> numbers, Integer elementForSearch) {
        int low = 0;
        int high = numbers.size() - 1;
        int index;

        while (low <= high) {
            index = (low + high) / 2;

            if (numbers.get(index).equals(elementForSearch)) {
                return index;
            } else if (elementForSearch > numbers.get(index)) {
                low = index + 1;
            } else {
                high = index - 1;
            }
        }

        return null;
    }

    public static List<Integer> selectionSort(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>(numbers.size());
        int counter = numbers.size();

        for (int i = counter; i > 0; i--) {
            int indexSmall = getSmallest(numbers);
            result.add(numbers.get(indexSmall));
            numbers.remove(indexSmall);
        }

        return result;
    }

    private static int getSmallest(List<Integer> numbers) {
        Integer smallest = numbers.get(0);
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (smallest > numbers.get(i)) {
                smallest = numbers.get(i);
                index = i;
            }
        }
        return index;
    }
}
