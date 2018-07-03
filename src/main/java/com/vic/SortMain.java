package com.vic;

public class SortMain {

    public static void main(String[] args) {
        int[] numbers = {38, 5, 8, 98, 58, 10, 100, 50};
        SortMain sortMain = new SortMain();
//        sortMain.bubboSort(numbers);
        sortMain.selectSort(numbers);
//        sortMain.binarySearch(numbers, 8);
    }

    public int[] bubboSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序:");
        for (int i : numbers)
            System.out.print(i + " ");
        return numbers;
    }

    public int[] selectSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            int k = i;
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[k])
                    k = j;
            }
            temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
        System.out.println("\n选择排序:");
        for (int i : numbers)
            System.out.print(i + " ");
        return numbers;
    }

    public int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int middle;
        int pos = -1;
        while (left <= right) {
            middle = (left + right) / 2;
            if (target > numbers[middle])
                left = middle + 1;
            else if (target < numbers[middle])
                right = middle - 1;
            else {
                pos = middle;
                break;
            }
        }
        System.out.println("\n折半查找:" + pos);
        return pos;
    }
}
