import java.util.Arrays;
import java.util.Scanner;

public class Lead_game {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int sum[] = new int[n];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum1=sum1+a[i];
            sum2=sum2+b[i];

            sum[i]=sum1-sum2;
            if(sum[i]<0){
                sum[i]=sum[i]*(-1);
            }

        }

        Arrays.sort(sum); 
        System.out.println(sum[0]+" "+sum[n-1]);
    }
}
