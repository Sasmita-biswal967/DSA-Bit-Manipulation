import java.util.*;

class Main {
    public static boolean checkls(int n, int i){
      return (n & (1<<i)) != 0;
    }

    public static boolean checkrs(int n, int i){
      return ((n>>i) & i) == 1;
    }
  
    public static void main(String[] args) {
      int n = 13;
      int i = 2;

      if (checkls(n, i))
          System.out.println("Set");
      else
          System.out.println("Not Set");

    }
}
