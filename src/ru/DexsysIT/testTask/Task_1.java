package ru.DexsysIT.testTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;


public class Task_1 {
    static ArrayList<Integer> Rem3 = new ArrayList<>();
    static ArrayList<Integer> Rem7 = new ArrayList<>();
    static ArrayList<Integer> Rem21 = new ArrayList<>();
    static ArrayList<Integer> MainList = new ArrayList<>();

    public static ArrayList<Integer> InitArray(ArrayList<Integer> List) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Задайте длину массива: ");
        int Length = Integer.parseInt(reader.readLine());
        System.out.println("Введите массив чисел: ");

        for (int i = 0; i < Length; i++) {
            int Numbers = Integer.parseInt(reader.readLine());
            List.add(Numbers);

        }
        List.sort(Comparator.naturalOrder());
        return List;
    }


    public static ArrayList<Integer> MainList(ArrayList<Integer> List) {
        for (int i = 0; i < List.size() ; i++) {
            MainList.add(List.get(i));
        }

        return MainList;
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
        if (Rem3.isEmpty()) {
            System.out.println("Числа, которые делятся без остатка на 3: " + "Список пуст");
        } else {
            System.out.println("Числа, которые делятся без остатка на 3: " + Rem3);
        }
        if (Rem7.isEmpty()) {
            System.out.println("Числа, которые делятся без остатка на 7: " + "Список пуст");
        } else {
            System.out.println("Числа, которые делятся без остатка на 7: " + Rem7);
        }
        if (Rem21.isEmpty()) {
            System.out.println("Числа, которые делятся без остатка на 21: " + "Список пуст");
        } else {
            System.out.println("Числа, которые делятся без остатка на 21: " + Rem21);
        }
    }

    public static void printType(char a) {
        switch (a) {
            case 'x':
                if (Rem3.isEmpty()) {
                    System.out.println("Список x пуст");
                } else {
                    System.out.println("Числа, которые делятся без остатка на 3: " + Rem3);
                }
                break;
            case 's':
                if (Rem7.isEmpty()) {
                    System.out.println("Список s пуст");
                } else {
                    System.out.println("Числа, которые делятся без остатка на 7: " + Rem7);
                }
                break;
            case 'm':
                if (Rem21.isEmpty()) {
                    System.out.println("Список m пуст");
                } else {
                    System.out.println("Числа, которые делятся без остатка на 21: " + Rem21);
                }
                break;

        }

    }

    public static boolean anyMore() {

            if ( Rem3.size() + Rem7.size() + Rem21.size() < MainList.size()) {
              return true;

            } else return false;

    }

    public static void clearType(char a) {
        switch (a) {
            case 'x':
                Rem3.clear();
                break;
            case 's':
                Rem7.clear();
                break;
            case 'm':
                Rem21.clear();
                break;
        }
    }

    public static void merge() {
        Rem3.addAll(Rem7);
        Rem7.addAll(Rem21);

        for (int i = 0; i < Rem3.size(); i++) {
            System.out.print(Rem3.get(i) + " ");
        }

        Rem3.clear();
        Rem7.clear();
        Rem21.clear();
    }

    public static void help() {
        System.out.println("1. initArray - инициализация списков набором значений array" + "\n" +
                "2. print- печать всех списков " + "\n" +
                "3. printType - печать конкретного списка, где type принимает значения X,S,M" + "\n" +
                "4. anyMore - выводит на экран были ли значения не вошедшие ни в один список, возможные значения true, false" + "\n" +
                "5. clearType - чистка списка , где type принимает значения X,S,M" + "\n" +
                "6. merge - слить все списки в один вывести на экран и очистить все списки");
    }
}


