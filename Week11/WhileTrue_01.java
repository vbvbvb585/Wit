package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {
        
        //int i  =2; // 
        //while (true) { 
        //    System.out.println( i++); 
        //    i ++; 
        //    if (i==1000) {
        //         break;
        //    }
        int sum =0;
        for (int number = 1; number <=10; number++) {
            sum= sum + number;
            System.out.println("รอบที่ "+ number + " ผลบวกเท่ากับ " + sum );
        }
        System.out.println("รวมเท่ากับ "+sum);
    }
}