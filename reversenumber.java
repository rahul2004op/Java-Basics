import java.util.Scanner;

public class reversenumber {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to reverse :");
        int num= sc.nextInt();
        int rn=0;
        int rem;
        while(num!=0){
            rem=num%10;
            rn=rn*10+rem;
            num=num/10;

        }
        System.out.println("reverse of number :"+rn);

    }
}
