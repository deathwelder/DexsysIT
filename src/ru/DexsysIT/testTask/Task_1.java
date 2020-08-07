package ru.DexsysIT.testTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_1 {

    public static ArrayList<Integer> ArrayOfNumbers(ArrayList<Integer> List) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Задайте длину массива: ");
        int Length = Integer.parseInt(reader.readLine());
        System.out.println("Введите массив чисел: ");

        for (int i = 0; i < Length ; i++) {
            int Numbers = Integer.parseInt(reader.readLine());
            List.add(Numbers);

        }

        return List;
    }

    public static void Remainder_3(ArrayList<Integer> List) {
        System.out.print("Числа, которые делятся без остатка на 3: ");
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) % 3 == 0) {
                System.out.print(List.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void Remainder_7(ArrayList<Integer> List) {
        System.out.print("Числа, которые делятся без остатка на 7: ");
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) % 7 == 0) {
                System.out.print(List.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void Remainder_21(ArrayList<Integer> List) {
        System.out.print("Числа, которые делятся без остатка на 21: ");
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) % 21 == 0) {
                System.out.print(List.get(i) + " ");
            }
        }
        System.out.println();
    }
}
