package Week15;

public class Array_Insert_1to1000 {
    public static void main(String[] args) {
      int [] m = new int [1000];
      //System.out.println(m.length);

      for (int i = 0; i < m.length; i++) {
          m[i] = i+1;
          
      }
      for (int i = 0; i < m.length; i++) {
        System.out.print(m[i]+" ");
        
      }
    }
}
