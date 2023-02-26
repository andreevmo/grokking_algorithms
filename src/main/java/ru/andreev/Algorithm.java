package ru.andreev;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] arrNew = new int[arr.length - 1];
            System.arraycopy(arr, 1, arrNew, 0, arrNew.length);
            return arr[0] + sum(arrNew);
        }
    }

    public static int countElements(List<?> list) {
        if (list.size() == 0) {
            return 0;
        } else if (list.size() == 1) {
            return 1;
        } else {
            List<?> li = new ArrayList<>(list);
            li.remove(0);
            return 1 + countElements(li);
        }
    }

    public static Integer findGreatestNum(List<Integer> numbers) {
        if (numbers.size() > 1) {
            List<Integer> list = new ArrayList<>(numbers);
            if (list.get(0) > list.get(1)) {
                list.remove(1);
            } else {
                list.remove(0);
            }
            return findGreatestNum(list);
        }
        return numbers.size() == 0 ? null : numbers.get(0);
    }

    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() > 1) {
            int index = (int) (Math.random() * list.size());
            Integer pivot = list.get(index);
            list.remove(index);
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            divideBy(list, less, greater, pivot);
            List<Integer> result = new ArrayList<>(quickSort(less));
            result.add(pivot);
            result.addAll(quickSort(greater));
            return result;
        }
        return list;
    }

    private static void divideBy(List<Integer> main, List<Integer> less, List<Integer> greater, Integer pivot) {
        for (Integer n : main) {
            if (n > pivot) {
                greater.add(n);
            } else {
                less.add(n);
            }
        }
    }

    public static Node searchInWidth(Node head, String missingElement) {
        Deque<Node> nodes = new ArrayDeque<>(head.getFriends());
        Set<Node> checked = new HashSet<>();
        checked.add(head);

        while (!nodes.isEmpty()) {
            Node checkNode = nodes.pop();
            if (!checked.contains(checkNode)) {
                if (checkNode.getName().equals(missingElement)) {
                    return checkNode;
                }
                nodes.addAll(checkNode.getFriends());
                checked.add(checkNode);
            }
        }

        return null;
    }
}
