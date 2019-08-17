public class q1{
    public static void main(String[] args) {
        
        absolute(-7);
        B b1 = new B();
        C c1 = new C();


    }
    public static void absolute(int n){
        System.out.println("Math.abs("+n+")="+Math.abs(n));

    }
    
}
class A {
    String a;
    A(){
        System.out.println("I have cut the onion!");
    }
}
class B extends A{
    String b;
    B(){
        super();
        System.out.println("I have fried the onion!");
    }
}
class C extends A{
    String c;
    C(){
        super();
        System.out.println("Together, we have cooked onion!");

    }
}