class A{
    public void show(){
        System.out.println("in A show");
    }
     public void show1(){
        System.out.println("in B show1");
    }
   
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }

    public void show1(){
        System.out.println("in B show1");
    }
    
}
public class extensions {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        B obj1 = new B();
        obj1.show();

        obj = new B();
        obj.show1();
    }

    
}
