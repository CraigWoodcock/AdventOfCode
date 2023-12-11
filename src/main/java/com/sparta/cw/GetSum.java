package com.sparta.cw;

import java.util.ArrayList;
import java.util.Arrays;

public class GetSum {
     static int getSum(ArrayList<String> list, StringBuilder sb, int sum) {
        for (String line : list) {

            char[] toChar = line.toCharArray();

                Arrays.sort(toChar);
            System.out.println(toChar);
            for (char c : toChar) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }

            if (sb.length() > 1) {
                System.out.println("The digits in this string are: " + "\n" + sb);
                int numA = Integer.parseInt(sb.substring(0, 1)) * 10;
                int numB = Integer.parseInt(sb.substring(sb.length() - 1, sb.length()));
                System.out.println(numA + " + " + numB + " = " + (numA + numB) + "\n");
                sum += (numA + numB);
                sb.setLength(0);
            } else if (sb.length() > 0) {
                System.out.println("The digits in this string are: " + "\n" + sb);
                int temp = Integer.parseInt(sb.substring(0, 1));
                int numA = temp * 11;
                sb.setLength(0);
                System.out.println(temp + " * 11 = " + numA + "\n");
                sum += numA;

            }


        }
        return sum;
    }
}
