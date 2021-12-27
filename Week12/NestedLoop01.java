package Week12;

public class NestedLoop01 {
    public static void main(String[] args) {
        //int number = 2;
        for (int i = 2; i <=12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i+"X"+j+"="+(i*j));
            }
        }
    }
}
