import java.util.Scanner;
class human {
    private String name;
    private int age;

  
    public void setAge(int m){
        age=m;
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
}

public class getter_setter {
    public static void main(String[] args) {
        human obj = new human();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        String n = sc.next();
        obj.setAge(m);
        obj.setName(n);

        System.out.println();

       
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}
