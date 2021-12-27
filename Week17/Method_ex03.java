package Week17;

public class Method_ex03 {
    // method แบบที่ 3 ไม่ได้รับค่าที่ส่งมา main program แต่ไม่มีการส่งค่าออกคืนแม่
    public static void main(String[] args) {
        int phone = getPhoneNumber();
        System.out.println();

        int lucky = 999;
        int newphone = phone+lucky;
        System.out.println(newphone);

    }

    static int getPhoneNumber() {
        return 943273146;

    }
}
