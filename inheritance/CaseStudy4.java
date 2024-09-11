// "static void main" must be defined in a public class.
// Case Study-1
class A{
    
    int d=12;
    A(int d){
        System.out.println("A constructor is called");
        this.d=d;
    }
}
class B extends A{
    
    int a=12;
    B(int d, int a){
        super(d);
        System.out.println("B is called");
    }
    
}
public class Main {
    public static void main(String[] args) {
        
        B obj= new B(30, 40);
        System.out.println(obj.d);

        // Output
//         A constructor is called
//         B is called
//          30
    }
}
