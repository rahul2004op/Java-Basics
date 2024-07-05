import java.util.Scanner;

public class CountNumberofdigit {
    public static void main(String [] agrs){
        Scanner  sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count=count+1;
        }
        System.out.println("number of digit :"+ count);
    }
    
}
