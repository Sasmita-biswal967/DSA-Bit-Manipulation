import java.util.*;

class Main {
    public static String convert2Bin(int n){
        if (n == 0) return "0";
        String res="";
        while(n>0){
            if(n%2==1) res+="1";
            else res+="0";
            n=n/2;
        }
        return new StringBuilder(res).reverse().toString();
    }
    public static void main(String[] args) {
        
        System.out.println(convert2Bin(13));
    }
}
