package com.olha.demo2;

public class MassEditor {
    //объявляем массив из 20 елементов
    int[] array = new int[20];
    int i;

    public MassEditor() {
        for (i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * (20 + 1)) - 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //создаю метод поменять местами максимальный отрицательный элемент  и минимальный положительный
    public void rplcMinMax() {
        int min = getFirstNeg();
        int max = getFirstPos();
        int temp;
        for (i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                if (array[max] > array[i]) {
                    max = i;
                }
            } else if (array[i] < 0) {
                if (array[min] < array[i]) {
                    min = i;
                }
            }
//            if (array[min] > array[i] && array[i] > 0) min = i;
//            if (array[max] < array[i] && array[i] < 0) max = i;
//            temp = array[min];
//            array[min] = array[max];
//            array[max] = temp;
        }
        System.out.println("max=" + array[max]);
        System.out.println("min=" + array[min]);
    }

    private int getFirstPos() {
        for (i = 0; i < array.length; i++) {
            if (array[i] >= 0) return i;
        }
        return 0;
    }

    private int getFirstNeg() {
        for (i = 0; i < array.length; i++) {
            if (array[i] < 0) return i;
        }
        return 0;
    }
}



