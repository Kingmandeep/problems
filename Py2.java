import java.util.Scanner;

public class Py2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int rem,sum=0;
            int a=sc.nextInt();
            while(a>0)
            {
                rem=a%10;
                sum=sum+rem;
                a=a/10;
            }
            System.out.println(sum);
            n--;
        }
    }
    
}
