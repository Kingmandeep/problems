import java.util.Scanner;

public class Py1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]%b==0){
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
    
}
