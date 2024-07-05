
import java.util.Scanner;

public class switchcase {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("+ for addtion");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");

        System.out.print("enter 1st number :");
        int a=sc.nextInt();

        System.out.print("enter 2nd number :");
        int b=sc.nextInt();
        
        System.out.print("enter your choice :");
        char ch=sc.next().charAt(0);
        switch(ch){
            
            case '+':{
                System.out.println("addition :"+(a+b));
                break;
            }
            case '-':{
                System.out.println("subtraction :"+(a-b));
                break;
            }
            case '*':{
                System.out.println("multiplication :"+(a*b));
                break;
            }
            case '/':{
                System.out.println("division :"+(double)(a/b));
                break;
            }


        }

    }
}
