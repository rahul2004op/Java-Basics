
import java.util.*;


 class ConstructorCalling {

    public ConstructorCalling() {
        System.out.println("constructor of class b");
    }
}

public class b extends ConstructorCalling{
    public b(){
        System.out.println("constructor of class a");
    }
    public static void main(String[] args) {
        b obj2=new b();
        ConstructorCalling obj=new ConstructorCalling();
        
    }
}
