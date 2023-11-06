package org.example;

public class SuffixQualifier {
    public String determineSuffix(int number) {
        if (number >= 10 && number <=20) return "яблок";

        int lastNumber = number < 10 ? number : number % 10;
        if (lastNumber == 1) return "яблоко";
        if (lastNumber == 2 || lastNumber == 3 || lastNumber == 4) return "яблока";
        else return "яблок";
    }

    public void storeNamesApples(String name, int apples) {
        System.out.println(name + " хранит " + apples + " " + determineSuffix(apples));
    }
}