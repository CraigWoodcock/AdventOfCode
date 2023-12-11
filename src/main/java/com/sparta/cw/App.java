package com.sparta.cw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        try {

            ArrayList<String> list = getStrings();
            StringBuilder sb = new StringBuilder();

            System.out.println(" ");

            int sum = 0;
            sum = GetSum.getSum(list, sb, sum);
            System.out.println("The Resulting Integer is: " + sum);
        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }


    }

    private static ArrayList<String> getStrings() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/main/resources/Advent.txt"));
        ArrayList<String> list = new ArrayList<>();
        while(scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        return list;
    }

}
