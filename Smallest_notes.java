import java.util.Scanner;

public class Smallest_notes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            int sum=0;
            sum=sum+a/100;
            a=a%100;
            sum=sum+a/50;
            a=a%50;
            sum=sum+a/10;
            a=a%10;
            sum=sum+a/5;
            a=a%5;
            sum=sum+a/2;
            a=a%2;
            sum=sum+a;
            

            System.out.println(sum);
            n--;
        }
    }
    
}
