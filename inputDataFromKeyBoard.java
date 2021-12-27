// nextByte       
//nextShort       
//nextInt      
//nextLong    
//nextFloat    
//nextDouble  
import java.util.Scanner;
public class inputDataFromKeyBoard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       
        System.out.print("Enter your ID : ");
        Long id = kb.nextLong();
        kb.nextLine();

        System.out.print("Enter your name and surname : ");
        String name = kb.nextLine();

        System.out.print("Enter your birth year : ");
        int year = kb.nextInt();
   
        System.out.print("Enter your GPA : ");
        double gpa = kb.nextDouble();

        int age = 2564-year;  // คำนวณอายุ

        System.out.println(id+" "+name+" "+age+" "+gpa);
        kb.close(); 

    }
}
