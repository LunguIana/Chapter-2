package ex31;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int num,a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Entera Number:");
        num = input.nextInt();
        a=num;
        b=num*num;
        c=num*num*num;
        System.out.printf("Namber is= %d \n ",a );
        System.out.printf("Squares is= %d \n ",b);
        System.out.printf("Cubes is= %d \n ",c);
    }
}
