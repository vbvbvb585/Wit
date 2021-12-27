package Week17;

public class Method_ex04 {
    public static void main(String[] args) {
        // method แบบที่ 4  มีการรับค่าที่ส่งมาจาก main program  และลูกส่งค่าออกคืนแม่
        //plus(5.5,9);
        System.out.println(plus(5.5,9));
        System.out.println(plus(222.2, 55));


    }
    static double plus(double a,int b){
        Double c = a+b;
        return c;

        //retrun a+b;

    }
}