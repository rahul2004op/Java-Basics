import java.util.Scanner;
public class sumofdigitinnumber {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();
        int rem=0;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;

        }
        System.out.println("sum of digit is "+sum);

    }
}
