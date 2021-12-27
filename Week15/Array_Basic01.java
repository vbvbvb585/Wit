package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ array
        // แบบที่ 1 : ประกาศแบบกำหนดสมาชิก
        int[] number = { 1, 2, 3, 44, 34, 54, 77, 11, 9 };
        int size = number.length;
        System.out.println(size);
        System.out.println(number.length); // หาค้าความยาวของอาเรย์
        System.out.println(number[3]); // การเข้าถึงตำแหน่งของตัวแปร
        number[3] = 88; // การเปลี่ยนค่าข้อมูลในตัวแปร
        System.out.println(number[3]);

        // แบบที่ 2 : ประกาษแบบกำหนดขนาด
        
        //char [] alphabet; // ประกาศอาเรย์ 
        //alphabet = new char[26];   //สร้างอาเรย์

        char [] alphabet = new char[26];
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';

        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);

        int []num = new int [10];
        System.out.println(num[9]);



        //char [] alphabet ={'a','b','c','d'};

    }
}
