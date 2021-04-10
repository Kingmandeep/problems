import java.util.Scanner;


public class Small_Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n>0){
            int sum=1;
            int a=sc.nextInt();
            for(int i=1;i<=a;i++)
            {
                sum=sum*i;
            }
            System.out.println(sum);
            n--;

        }
    }
    
}
