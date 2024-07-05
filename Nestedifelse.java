import java.util.Scanner;


public class Nestedifelse {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter the 1st number : ");
        int a=sc.nextInt();
        System.out.print("enter the 2nd number : ");
        int b=sc.nextInt();
        System.out.print("enter the 3rd number : ");
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("the greatest number is "+a);
            }
            else{
                System.out.println("the greatest number is "+c);
            }
        }
        
        else{  //b > a 
            if(b>c){
                System.out.println("the greatest number is "+b);
            }
            else{// c>b>a
            System.out.println("the greatest number is "+c);
            }
        }

        


    }    
}
