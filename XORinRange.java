import java.util.*;

class Main {
    public static int findxor(int n){
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
    public static void main(String[] args) {
        int l=4, r=7;
        int ans = findxor(l-1) ^ findxor(r);
        System.out.println(ans);

        int n=8;
        int answ=fndxor(n);
        System.out.println(answ);
    }
}
