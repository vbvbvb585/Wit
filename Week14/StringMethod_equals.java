package Week14;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Temboriboon";
        String lastname2 = "Temboriboon";

        // เปรียบเทียบ เท่ากัน .equals
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);
        //System.out.println(result);

        //เปรียบเทียบ เท่ากันไม่สนใจอักษรเล็กหรือใหญ่ .equals()
        if (result2) {
            System.out.println(lastname1 + " เท่ากับ " + lastname2);
        } else {
            System.out.println(lastname1 + " ไม่เท่ากับ " + lastname2);
        }
    }
}
