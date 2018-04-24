import javax.swing.*;
import java.util.Scanner;

public class Laboratorium1
{

    public static void digits()
    {
        int number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1=in.nextInt();
        System.out.println("Enter second number: ");
        number2=in.nextInt();
        int sum=number1+number2;
        System.out.println("Suma = "+sum);
    }


    public static void main(String[] args)
    {
        paragon.start();
        //paragon();
    }
}
