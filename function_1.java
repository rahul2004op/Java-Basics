
class add{
    int a,b;
    void sum(int a,int b){
        int c=a+b;
        System.out.print("addtion is "+c);
    }
}



public class function_1 {
    int a,b;
    public static void main(String[] args){
        add obj=new add();
        obj.sum(12,36);
    }
}

