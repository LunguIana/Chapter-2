package ex24;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,
                number2,
                number3,
                number4,
                number5;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        number3 = input.nextInt();
        System.out.print("Enter fourth integer: ");
        number4 = input.nextInt();
        System.out.print("Enter fifth integer: ");
        number5 = input.nextInt();

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
            System.out.printf("Largest of five integers is %d  and, ", number1);
        if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
            System.out.printf("Largest of five integers is %d  and, ", number2);
        if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
            System.out.printf("Largest of five integers is %d  and, ", number3);
        if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5)
            System.out.printf("Largest of five integers is %d  and, ", number4);
        if (number5 > number1 && number5 > number2 && number5 > number3 && number4 > number5)
            System.out.printf("Largest of five integers is %d and, ", number5);
        if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5)
            System.out.println("The smallest number is " + number1);
        if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5)
            System.out.println("The smallest number is " + number2);
        if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5)
            System.out.println("The smallest number is " + number3);
        if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5)
            System.out.println("The smallest number is " + number4);
        if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4)
            System.out.println("The smallest number is " + number5);
    }
}

