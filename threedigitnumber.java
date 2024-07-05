import java.util.Scanner;

public class threedigitnumber {
    public static void main(String [] args){
    System.out.print("enter the number :");

    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    if(n>0 && n>99 && n<1000 && (n%3==0 || n%5==0)){
        System.out.println("the number is three digit positive number divisible by 3 or 5  ");
    }
    else{
        System.out.println("number is not positive three digit number not divisible by 3 or 5");
    }
    }

}
