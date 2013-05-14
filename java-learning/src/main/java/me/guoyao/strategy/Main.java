package me.guoyao.strategy;

import java.util.Arrays;

/**
 * User: guoyao
 * Time: 05-14-2013 11:26
 */
public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("arguments are: " + Arrays.toString(args));
        System.out.println("result is: " + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
    }
}
