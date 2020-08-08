package ru.DexsysIT.testTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_1 {
    static ArrayList<Integer> Rem3 = new ArrayList<Integer>();
    static ArrayList<Integer> Rem7 = new ArrayList<Integer>();
    static ArrayList<Integer> Rem21 = new ArrayList<Integer>();

    public static ArrayList<Integer> InitArray(ArrayList<Integer> List) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Задайте длину массива: ");
        int Length = Integer.parseInt(reader.readLine());
        System.out.println("Введите массив чисел: ");

        for (int i = 0; i < Length; i++) {
            int Numbers = Integer.parseInt(reader.readLine());
            List.add(Numbers);

        }

        return List;
    }

    public static ArrayList<Integer> Remainder_3(ArrayList<Integer> List) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) % 3 == 0) {
                Rem3.add(List.get(i));
            }
        }

        return Rem3;
    }

    public static ArrayList<Integer> Remainder_7(ArrayList<Integer> List) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) % 7 == 0) {
                Rem7.add(List.get(i));
            }
        }

        return Rem7;
    }

    public static ArrayList<Integer> Remainder_21(ArrayList<Integer> List) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) % 21 == 0) {
                Rem21.add(List.get(i));
            }
        }

        return Rem21;
    }

    public static void print() {
        System.out.println("Числа, которые делятся без остатка на 3: " + Rem3);
        System.out.println("Числа, которые делятся без остатка на 7: " + Rem7);
        System.out.println("Числа, которые делятся без остатка на 21: " + Rem21);
    }

    public static void printType(char a) {
        switch (a) {
            case 'x':
                System.out.println("Числа, которые делятся без остатка на 3: " + Rem3);
                break;
            case 's':
                System.out.println("Числа, которые делятся без остатка на 7: " + Rem7);
                break;
            case 'm':
                System.out.println("Числа, которые делятся без остатка на 21: " + Rem21);
                break;

        }

    }

    public static void anyMore() {

    }
}
