package com.sparta.cw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        try {

            Scanner scanner = new Scanner(new File("src/main/resources/Advent.txt"));
            ArrayList<String> list = new ArrayList<>();
            while(scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
            StringBuilder sb = new StringBuilder();

            System.out.println(" ");

            int sum = 0;
            for (String line : list){

                char[] toChar = line.toCharArray();

//                Arrays.sort(toChar);
                System.out.println(toChar);
                for (char c: toChar){
                    if (Character.isDigit(c)){
                          sb.append(c);
                    }
                }
                 if (sb.length()>1) {
                     System.out.println("The digits in this string are: " + "\n" +sb);
                     int numA = Integer.parseInt(sb.substring(0,1))*10;
                     int numB = Integer.parseInt(sb.substring(sb.length()-1,sb.length()));
                     System.out.println(numA + " + " + numB + " = " + (numA+numB) + "\n");
                     sum += (numA+numB);
                     sb.setLength(0);
                }else if(sb.length()>0){
                     System.out.println("The digits in this string are: " + "\n" +sb);
                     int temp = Integer.parseInt(sb.substring(0,1));
                     int numA = temp*11;
                     sb.setLength(0);
                     System.out.println(temp + " * 11 = "+numA + "\n");
                    sum += numA;

                }
                System.out.println("The Resulting Integer is: " + sum);

            }

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }


    }
}
