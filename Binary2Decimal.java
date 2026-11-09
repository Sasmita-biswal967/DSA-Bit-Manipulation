import java.util.*;

class Main {
    public static int convert2Dec(String x){
        int len=x.length();
        int pow=1;
        int num=0;
        for(int i=len-1;i>=0;i--){
            if(x.charAt(i)=='1') num+=pow;
            pow=pow*2;
        }
        return num; 
    }
    public static void main(String[] args) {
        
        System.out.println(convert2Dec("1101"));
    }
}
