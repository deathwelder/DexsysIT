package ru.DexsysIT.testTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MainClass {

    public static void main(String[] args) throws IOException {

       ArrayList<Integer> Numbers = Task_1.ArrayOfNumbers(new ArrayList<>());

       Task_1.Remainder_3(Numbers);
       Task_1.Remainder_7(Numbers);
       Task_1.Remainder_21(Numbers);

    }
}
