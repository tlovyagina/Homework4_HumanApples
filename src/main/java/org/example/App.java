package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        System.out.println("Введите имя и количество яблок: ");
        Scanner scanner = new Scanner(System.in);
        SuffixQualifier qualifier = new SuffixQualifier();
        qualifier.storeNamesApples(scanner.nextLine(), scanner.nextInt());
    }
}