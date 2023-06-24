package logic;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner readin = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = readin.nextInt();

        int fib = fibonacciR(number);
        System.out.printf("f(%d): %d\n", number, fib);

    } // end main

    // recursive method
    public static int fibonacciR(int number) {

        if (number <= 1) {
            return number;
        } else { //recursive call 
            return (fibonacciR(number - 1) + fibonacciR(number - 2));
        }
    } // end 

}
