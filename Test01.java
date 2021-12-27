public class Test01 {
    public static void main(String[] args) {
        int num = 5;
        String result = "";

        if (num > 0) {
            result = num + " is positive";
        } else if (num <0) {
            result = num + " is negative";
        } else {
            result = num + " is zero";

        }
        System.out.println(result);
    }
}
