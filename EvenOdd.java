import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number :");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("the number is even number ");
        }
        else{
            System.out.println("the number is odd ");
        }
    
    }
}