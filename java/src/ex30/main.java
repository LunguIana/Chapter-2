package ex30;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter a number: ");
        int num =input.nextInt();
        int digit1 =num / 10000;
        int digit2 =(( num % 10000) / 1000 );
        int digit3 =( ( num % 1000) / 100 );
        int digit4 = ( ( num % 100 ) / 10 );
        int digit5 = ( num % 10);

        System.out.print (digit1+"  ");
        System.out.print(digit2+"  ");
        System.out.print(digit3+"  ");
        System.out.print(digit4+"  ");
        System.out.println(digit5+"  ");
    }

}

