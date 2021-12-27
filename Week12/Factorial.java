package Week12;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = kb.nextInt();

        int i = 1;
        int result = 0;
        System.out.println(number + "! ==> ");
        while (i <= number) {
            if (i == number) {
                System.out.println(i + "=");
            } else {
                System.out.println(i + "X");
            }
            result = result * i;
            i++;
        }
        System.out.println(" = ");
    }
}
