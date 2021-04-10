import java.util.Scanner;

public class Rem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int rem;
            if(a>b){
                rem=a%b;
            }else{
                rem=a;
            }
            System.out.println(rem);
            n--;
        }
        
    }
    
}
