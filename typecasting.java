import java.util.Scanner;

public class typecasting {
    public static void main(String[] args){
        int p=42;
        double q= (double) p;
        System.out.println(q/2);
        
        double s=120.36;
        int t=(int) s;
        System.out.println(t/2);

        //print the ASCII values
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the character :");
        char ch= sc.next().charAt(0);
        System.out.print(ch);
        System.out.println("\nASCII value "+(int)ch);
        System.out.println(2%-8);

    }
    
}
