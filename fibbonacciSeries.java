import java.util.Scanner;
class fibbonacciSeries{
    public static void main(String [] args){
        int first=0, second=1, next;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n= sc.nextInt();
        while(first<=n){
            System.out.print(first+" ");
            next=first+second;
            first=second;
            second=next;


        }

    }
}