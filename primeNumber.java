import java.util.Scanner;
public class primeNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :" );
        int n=sc.nextInt();
        

int x=0;
        for(int i=2;i<=n-1;i++){
            if (n%i==0){
                System.out.println("the number is composite"); 
                x=1;
                break;
            }
            
           
        }
        if(x==0){
            System.out.println("the number is prime");
            
        }
        
    }
}
