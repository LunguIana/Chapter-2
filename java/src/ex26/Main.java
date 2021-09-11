package ex26;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.println("Enter first number:");
        number1 = input.nextInt();
        System.out.println("Enter second number:");
        number2 = input.nextInt();

        if (number1 % number2 == 0) {
            System.out.println("Result is=" + number1 / number2);
        } else {
            System.out.println("First number isn't a multiple of the second number");
        }
    }
}
