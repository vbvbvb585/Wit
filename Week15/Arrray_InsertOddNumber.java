package Week15;

public class Arrray_InsertOddNumber {
    public static void main(String[] args) {
        int[] x = new int[10];
        // System.out.println(x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+ " "); // แสดงผลอาเรย์ก่อนเพิ่มข้อมูล
        }

        // เริ่มเพิ่มข้อมูลเช้าไปในอาเรย์ทั้ง 10 ช่อง
        int number=1;
        for (int i = 0; i < x.length; i++) {
            x[i] = number;
            number = number+2;
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+ " "); // แสดงผลอาเรย์หลังเพิ่มข้อมูล
        }

    }
}
