import java.util.Arrays;
import java.util.Scanner;

public class Second_largest {
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[3];
        while(n>0)
        {
            for(int i=0;i<3;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[1]);
            n--;
        }
    }
}
