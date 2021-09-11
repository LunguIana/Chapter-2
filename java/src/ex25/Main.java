package ex25;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr;

        System.out.println("Enter a number:");
        nr = input.nextInt();

        if (nr % 2 == 0) {                          //daca numarul se imarte la 2 nu are rest atunci este par
            System.out.println(nr + " is even");   // afiseaza ca numarul este par

        } else {
            System.out.println(nr + " is odd");   //afisiaza ca numarul este impar
        }
    }

    public static boolean nr(int x) {
        if ((x % 2) == 0) {
            System.out.println(" True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }
}

