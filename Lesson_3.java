package com.homeproject.firstproject;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {
        //пункт 1
        System.out.println("--------пункт 1------------");
        int[] arr1 = new int[]{0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                System.out.println(arr1[0]);
            } else if (arr1[i] == 0) {
                System.out.println(arr1[1]);
            }
        }

        //пункт 2
        System.out.println("--------пункт 2------------");
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.println(arr2[i]);
        }

        //пункт 3
        System.out.println("--------пункт 3------------");
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
                System.out.println(arr3[i]);
            } else System.out.println(arr3[i]);
        }

        //пункт 4
        System.out.println("--------пункт 4------------");
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                        arr4[i][j] = 1;}
                System.out.print(arr4[i][j] + " ");
            } System.out.println();
        }

        //пункт 5
        System.out.println("--------пункт 5------------");
        Scanner scannerLen = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int len = scannerLen.nextInt();
        int[] arr5 =  new int[len];

        Scanner scannerValue = new Scanner(System.in);
        System.out.println("Введите значение элементов в массиве: ");
        String initialValue = scannerValue.nextLine();

        for (int i = 0; i < arr5.length; i++){
            System.out.println(initialValue);
        }
    }
}



