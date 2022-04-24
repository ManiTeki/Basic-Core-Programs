package com.bridgelabz;

public class PowerOfNumber {
    public static void main(String[] args) {
        int basenumber = 2, exponent = 31;
        long result = 1;
        for (; exponent != 0; --exponent) {
            result = result * exponent;
        }
        System.out.println("Answer " + result);
    }
}
