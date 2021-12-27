package Week14;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นายสมชาย เข็มขัด";

        // หาตำแหน่งของคำ  .startsWith()
        boolean result = fullname.startsWith(fullname);

        if (result) {
            System.out.println(fullname + "เป็นเพศชาย");
        } else {
            System.out.println(fullname + "เพศหญิง");
        }

        //หาตำแหน่งของคำจากด้านหลัง  .endWith()
        String code = "356278TH";
        boolean  result1 = code.endsWith("TH");
        if (result1) {
            System.out.println("สินค้า " + code + "สินค้ามาจากประเทศไทย");
        } else {
            System.out.println("สินค้า"  + code + "มาจากต่างประเทศ");
        }
    }
        
}
