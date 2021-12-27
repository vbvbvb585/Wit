package Week10;

public class IfStatement01 {
    public static void main(String[] args) {
        int time = 22;

        if (time< 12) {
            System.out.println("Good Morning");
        }else if(time <= 17){
            System.out.println("Good Afternoon");
        }else if(time <=21){
            System.out.println("Good Evening");
        }else{
            System.out.println("Good Night");
        }
    }
}
