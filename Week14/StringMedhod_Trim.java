package Week14;

public class StringMedhod_Trim {
    public static void main(String[] args) {
        String fullname = "   Wit Temboriboon  ";

        int count = fullname.length();
        System.out.println(count);
        System.out.println(fullname);

        // .trim()  ตัดช่องว่างหน้าหลังออก

        String result = ( fullname.trim());
        System.out.println("after ==>"+result);
        System.out.println(result.length());


        // .indexOf()
        System.out.println(fullname.indexOf("Te", 9));

        // .toUpperCase   .toLowerCase
        System.out.println(result.toUpperCase());
        System.out.println(result.toUpperCase());

        // .Substring()   การตัดคำที่ต้องการ
        String uni = "Nakhon Pathom Rajabhat Untiversity";
        System.out.println(uni.substring(5));
    }   
}
