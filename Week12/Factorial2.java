package Week12;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = kb.nextInt();

        int i = number;
        int result = 1;

        System.out.println(number + "! ==> ");
        while (i >=1) {
            if (i == number) {
                System.out.println(i);
            } else {
                System.out.println(i+"x");
            }
            result = result * i;
            i--;
        }
        System.out.println(" = "+result);
    }
}
