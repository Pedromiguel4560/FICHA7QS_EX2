package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number to check if is Prime: ");

        int number = input.nextInt();

        System.out.println("Number: " + number + "\n" + "Is Prime: " + isPrime(number));

    }

    public static boolean isPrime(int number){

        int countPrime = 0;
        int countNotPrime = 0;

        if (number <= 1){
            return false;
        }

        for (int i=1; i<=number; i++){

            if (i == 1 || i == number){
                if (number % i == 0){
                    countPrime++;
                }
            } else {
                if (number % i == 0){
                    countNotPrime++;
                }
            }
        }

        if (countPrime == 2 && countNotPrime == 0){
            return true;
        } else {return false;}

    }

    public static boolean isEven(int number){

        return number % 2 == 0;

    }

    public static boolean isMultiple(int number, int divisor){

        return number % divisor == 0;

    }

}