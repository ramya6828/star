import java.util.Scanner;
public class Main
{
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the number:");
         int n=s.nextInt();
         int a=1;
         for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(a+" ");
                 a=a+1;
             }
            System.out.println();
         }
     }
}
