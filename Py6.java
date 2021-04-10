import java.util.Arrays;
import java.util.Scanner;

public class Py6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        int sum[] = new int[4];
        for(int i=0;i<n;i++)  a[i]=sc.nextInt();
        if(n%2==0)
        {
            for(int i=1;i<(n/2)-1;i++)
            {
                sum[0]=sum[0]+a[i]+a[(n/2)+i];
            }
            for(int i=1;i<(n/2)-1;i++)
            {
                sum[1]=sum[1]+a[i]+a[(n/2)+i+1];
            }
            for(int i=0;i<(n/2)-2;i++)
            {
                sum[2]=sum[2]+a[i]+a[(n/2)+i+1];
            }
            for(int i=0;i<(n/2)-2;i++)
            {
                sum[3]=sum[3]+a[i]+a[(n/2)+i+2];
            }

            


        }else{
            for(int i=1;i<(n/2);i++)
            {
                sum[0]=sum[0]+a[i]+a[(n/2)+i];
            }
            for(int i=1;i<(n/2);i++)
            {
                sum[1]=sum[1]+a[i]+a[(n/2)+i+1];
            }
            for(int i=0;i<(n/2)-1;i++)
            {
                sum[2]=sum[2]+a[i]+a[(n/2)+i+2];
            }
            for(int i=0;i<(n/2)-1;i++)
            {
                sum[3]=sum[3]+a[i]+a[(n/2)+i+1];
            }
            
        }
        Arrays.sort(sum);
        System.out.println(sum[3]);
    }
    
}


/*
try{
	//Your Solve
	}catch(Exception e){
		return;
    }

 */
