import java.util.*;



public class First_and_last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            
            
            int a=sc.nextInt();
            int sum=0;
            int m=a;
            while(m>0)
            {
                sum=0;
                sum=sum+m%10;
                m=m/10;
            }
            if(a%10==0){
                System.out.println(sum);

            }else{
                int d=a%10;
                System.out.println(sum+d);

            }
            n--;
            
        }
    }
}
