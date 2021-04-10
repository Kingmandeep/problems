import java.util.*;
public class Py {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        double b= sc.nextDouble();
        if(a%5==0 && a+0.5<b)
        {
                
            double amt=b-a-0.5f;
            System.out.println(String.format("%.2f", amt));
    
        }else{
            System.out.println(String.format("%.2f", b));
        }

    }
        
}
