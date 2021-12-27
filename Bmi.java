import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ป้อนน้ำหนัก(kg) : ");
        float weight = kb.nextFloat();
        System.out.print("ป้อนความสูง(m) : ");
        float hight = kb.nextFloat();

        System.out.println("น้ำหนัก  = "+weight);
        System.out.println("ส่วนสูง  = "+hight);

        float bmi = weight/(hight*hight);
        System.out.println("ค่าดัชนีมวลกาย(BMI) = "+bmi);

        kb.close();
    }
}