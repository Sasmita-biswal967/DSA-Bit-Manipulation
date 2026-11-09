import java.util.*;

class Main {
    public static int clearIthBit(int n, int i){
      return n & ~(1<<i);
    }

    public static int toggleIthBit(int n, int i){
      return n^(1<<i);
    }
  
    public static boolean checkpowerof2(int n){
      return n > 0 && (n & n-1) == 0;
    }
  
    public static void main(String[] args) {
      int n = 13;
        int i = 2;

        System.out.println(clearIthBit(n, i));
        System.out.println(toggleIthBit(n, i));
        System.out.println(checkpowerof2(n));
    }
}
