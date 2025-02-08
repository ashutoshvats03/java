package practice;


class Students{
    int rollno;
    String name;
    static String school;

    public void show(){
            System.out.println(name + ":" + rollno + ":" + school);
    }

    public static void show1(){         //this is a static method...here we cant use non-static variables like name rollno....cause they dont whose rollno or name is to be name
            System.out.println(school);
    }

    public static void show2(Students obj){       //this is also a static method...but here we are specific in object so this makes variable temporary static variable
            System.out.println(obj.name + ":" + obj.rollno + ":" + school);
    }
}

public class stctic{
    public static void main(String[] args) {

        Students b1 = new Students();
        Students b2 = new Students();
        Students b3 = new Students();

        b1.name = "ashutosh";
        b1.rollno=21;

        b2.name = "karan";
        b2.rollno=2;

        b3.name = "sarfarz";
        b3.rollno=5;

        Students.school="HCIS"; //static variable are assigned once and they get assigned in all objects

        b1.show();
        b2.show();
        b3.show();
        System.out.println();

        Students.show1();     //static method are called like this only
        
        System.out.println();

        Students.show2(b1);
        Students.show2(b2);
        Students.show2(b3);
        System.out.println();
    }
}
