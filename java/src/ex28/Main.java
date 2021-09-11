package ex28;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r ;
        double pi = Math.PI;    //Math.PI for the value of π

        System.out.println("Enter radius:");
        r= input.nextInt();
        System.out.printf("Diameter =  %.1f\n",2*(double) r);  //double- keyword is a primitive data type
        // It is a double-precision 64-bit, double covers a range from:
        // 4.94065645841246544e-324d to 1.79769313486231570e+308d
        //It is used to declare the variables and methods
        System.out.printf("Circumference =  %.1f\n", 2 * pi * (double) r);
        System.out.printf("Area =  %.1f", pi * (double) (r * r));
    }
}
