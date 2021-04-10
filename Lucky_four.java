import java.util.Scanner;

public class Lucky_four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int a=sc.nextInt();
            int rem;
            int sum=0;
            while(a>0)
            {
                rem=a%10;
                a=a/10;
                if(rem==4){
                    sum=sum+1;
                }
            }
            System.out.println(sum);
            n--;
        }
    }
}
