package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        // ให้รับค่าตัวเลข แล้วบอกให้ได้ว่าตัวเลขนั้นเป็นจำนวนบวกหรือไม่
        int number = -15;
        String result = "";
        // การเขียนแบบ IF-ELSE

        if (number > 0) { // กรณีของตรวจสอบจำนวนเต็มบวก
            result = number+("เป็นจำนวนเต็มบวก");
        } else if (number < 0) { // กรณีของตรวจสอบจำนวนเต็มลบ
            result = number+ ("เป็นจำวนวนเต็มลบ");
        } else { // กรณีของตรวจสอบจำนวนเต็มศูนย์
            result = number+ ("เป็นจำวนวนเต็มศูนย์");
        }

        System.out.println(result);




        // การเขียนแบบ if else อย่างเดี่ยว
        // if (number > 0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        //
        // }
        // // กรณีของตรวจสอบจำนวนเต็มลบ
        // if (number < 0) {
        // System.out.println("เป็นจำวนวนเต็มลบ");
        // }
        // // กรณีของตรวจสอบจำนวนเต็มศูนย์
        // if (number == 0) {
        // System.out.println("เป็นจำวนวนเต็มศูนย์");
        // }
    }
}
