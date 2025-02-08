import java.util.Scanner;

public class oop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Calculator obj = new Calculator();  // creation of object file....using method from different class used in some other class object refrences the the method of different class
            int result = obj.add(a, b);
            System.out.println(result);
        }
        
    }
}

class Calculator{

    public int add(int n1,int n2){    // decleartion of methods if number of inputs is increased then it'll be said to overloading
        int r = n1 + n2;
        return r;
    }
}
