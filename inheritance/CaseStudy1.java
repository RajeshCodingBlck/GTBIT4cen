// "static void main" must be defined in a public class.
// Case Study-1
class A{
    
    int d=12;
    A(int d){
        this.d=d;
    }
}
class B extends A{
    
    int a=12;
    B(int d){
        super(d);
    }
    
}
public class Main {
    public static void main(String[] args) {
        
        B obj= new B(30);
        System.out.println(obj.d);
    }
}
