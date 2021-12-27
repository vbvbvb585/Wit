package Week10;

import java.util.Scanner;
public class IfElse_Grade {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter Score = ");
    int Score = kb.nextInt();
    if ((Score <0)||(Score >100)) {
        System.out.println("Error");
    }else if(Score>=80){
        System.out.println("A");
    }else if(Score>=70){
        System.out.println("B");
    }else if(Score>=60){
        System.out.println("C");
    }else if(Score>=50){
        System.out.println("D");
    }else{
        System.out.println("F");
    }
    kb.close();
  }
}
