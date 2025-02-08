class A{
    public A(){                  //constructor have same name as that of class but constains arguments
        super();
        System.out.println("const of A");
    }

    public A(int n){
        this();                  //this() here signifies that the constructor in THIS CLASS with argument inside "()" is to be executed 
        System.out.println("const of A int");
    }

    public A(int n,int m){
        super();                 //super here signifies that the constructor in SUPER CLASS with argument inside "()" is to be executed
        System.out.println("const of A int int");
    }
}

class B extends A{
     public B(){
       super(5);
        
        System.out.println("const of B");
    }

    public B(int n){
       // super();
       // this();
        System.out.println("const of B int");
    }

    public B(int n,int m){
        super();
        System.out.println("const of B int int");
    }
}



public class this_super {
    public static void main(String[] args) {
        B obj = new B();

    }
}
