import java.util.Scanner;
// print this arithmatic progression 1,3,5,7,9....
public class ArithmaticGeometricProgression {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the n :");
        int n=sc.nextInt();
        int a1=1;
        int d=2;    // an=a1+(n-1)*d   d is common diffrence
        int an=a1+(n-1)*d;
        for (int i=1;i<=an;i+=2){
            System.out.print(i+" ");
        }
        System.out.println("\n without using formula ");
        for (int i=1;i<=n;i++){
            System.out.print(a1+" ");
            a1+=2;
        }
        // print the geomrtric progrssion 2,4,6,8,10,....
        System.out.print("\n geometric progression \n");
        for(int i=1;i<=n;i++){
            System.out.print(a1+" ");
            a1*=2;
        }
    }
}
