import java.util.Scanner;

public class Valid_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[3];
        while(n>0)
        {
            int sum=0;
            for(int i=0;i<3;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(sum==180)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            n--;
        }
    }
    
}
