import java.util.Scanner;

public class ProfitLoss {

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the Cost Price :");
        int cp=sc.nextInt();
        System.out.print("enter the Selling Price :");
        int sp=sc.nextInt();

        if(cp>sp){
            System.out.println("You are in loss");
            System.out.println("Your loss amount : "+(-(sp-cp))+"Rs" );

        }

        else if(cp<sp){
            System.out.println("Your in profit");
            System.out.println("Your profit amount : "+(sp-cp)+"Rs");
        }
        else{
            System.out.println("You have nither loss nor Profit");

        }





    }
}
