import java.util.*;
import java.lang.Math;

public class Square_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            double a=sc.nextDouble();
            double b=Math.sqrt(a);
            int c=(int)b;
            System.out.println(c);
            n--;
        }
    }
    
}
