package ex17;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int sum, average, product;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter first integer: ");
        number3 = input.nextInt();
        sum = number1 + number2 + number3;
        System.out.println("sum is=" + sum);
        average = (number1 + number2 + number3) / 3;
        System.out.println("average is=" + average);
        product = number1 * number2 * number3;
        System.out.println("product is=" + product);
        if (number1 > number2 && number1 > number3)
            System.out.println("Is larger = " + number1);
        if (number2 > number1 && number2 > number3)
            System.out.println("Is larger = " + number2);
        if (number3 > number1 && number3 > number2)
            System.out.println("Is larger = " + number3);
        if (number1 < number2 && number1 < number3)
            System.out.println("Is smaller = " + number1);
        if (number2 < number1 && number2 < number3)
            System.out.println("Is smaller = " + number2);
        if (number3 < number1 && number3 < number2)
            System.out.println("Is smaller = " + number3);
    }
}