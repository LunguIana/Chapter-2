package ex16;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 < number2) {
            System.out.println("Is larger = " + number2);
        } else if (number1 > number2) {
            System.out.println("Is larger = " + number1);
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
