import java.util.Scanner;

class MatrixAddtion{
    public static void main (String [] args){

        Scanner sc= new Scanner(System.in);
        int a[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int b[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j] + b[i][j];
            }
        }
        System.out.println("\nAddtion of matrix is ");
        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            
            for(int j=0;j<3;j++){
                if(i==j){
                    c[i][j]=0;
                }
            }
        }

        System.out.println("\nNew matrix is ");
        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
