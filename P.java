import java.util.*;
public class P {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            for(int p=1;p<=a;p++)
            {
                for(int j=1;j<=a;j++)
                {
                    System.out.print(p);
                }
                System.out.println();
            }
            
        }
    }
    
}
