package ex30b;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.print((n / 10000)+ "   ");
        int x = 10000;
        int y = n % 10000;

        for(int i = 1; i <= 4; i++){
            x /= 10;
            System.out.print( y/x +"   ");
            y %=x;
        }
        System.out.println();
    }
}

