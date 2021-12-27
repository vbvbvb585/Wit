import java.util.Scanner;
public class MathOperator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("กรุณาป้อนตัวเลขที่ 1 : ");
        float a=kb.nextFloat();
        System.out.println("กรุณาป้อนตัวเลขที่ 2 : ");
        float b=kb.nextFloat();

        System.out.println("ค่าของตำแปร a = " + a);
        System.out.println("ค่าของตำแปร a = " + b);
        System.out.println("ผลบวก  = " + (a+b));
        System.out.println("ผลลบ  = " + (a-b));
        System.out.println("ผลคูณ  = " + (a*b));
        System.out.println("ผลหาร  = " + (a/b));
        System.out.println("ผลหารเอาเศษ  = " + (a%b));

        kb.close();
    }
}
