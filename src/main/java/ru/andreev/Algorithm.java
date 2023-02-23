package ru.andreev;

public class Algorithm {

    public static Integer binarySearch(Integer[] numbers, Integer elementForSearch) {
        int low = 0;
        int high = numbers.length - 1;
        int index;

        while (low <= high) {
            index = (low + high) / 2;

            if (numbers[index].equals(elementForSearch)) {
                return index;
            } else if (elementForSearch > index) {

                low = index + 1;
            } else {
                high = index - 1;
            }

        }

        return null;
    }
}
