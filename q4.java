public class q4 {
    public static void main(String[] args) {

        A class1 = new A();
        B class2 = new B();
        C class3 = new C();

        class1.p1();
        // class1.p2();
        // class1.p3();


        // class2.p2();
        
        // class2.p3();

        
        // class3.p2();
        // class3.p3();


        



    }
}
class A {

    public static void p1(){
        System.out.println("hey");
    }

}

class B extends A {
    private static voidp2(){
        System.out.println("hey");
    } 

}

class C extends A { 
    protected static void p3(){
        System.out.println("hey");
    }


}