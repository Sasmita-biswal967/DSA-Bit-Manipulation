import java.util.*;

class Main {
    public static int countsetbit(int n){
      int cnt=0;
      while(n>0){
        if((n&1)==1) cnt++;
        n=n>>1;
      }
      return cnt;
    }

    public static int cntsetbits(int n){
      int cnt=0;
      while(n!=0){
        n=n & (n-1);
        cnt++;
      }
      return cnt;
    }
   
    public static void main(String[] args) {
      int n = 13;

        System.out.println(countsetbit(n));
        System.out.println(cntsetbits(n));
    }
}
