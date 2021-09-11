package ex24b;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,
                number2,
                number3,
                number4,
                number5,
                lgt,    //lgt-longer
                smal;   //small- smaller

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

        lgt = number1;
        smal = number1;

        if (number2 > lgt)
            lgt = number2;
        if (number3 > lgt)
            lgt = number3;
        if (number4 > lgt)
            lgt = number4;
        if (number5 > lgt)
            lgt = number5;

        if (number2 < smal)
            lgt = number2;
        if (number3 < smal)
            lgt = number3;
        if (number4 < smal)
            lgt = number4;
        if (number5 < smal)
            lgt = number5;

        System.out.printf("Largest of five integers is %d, and smallest is %d%n", lgt, smal);
    }
}
