class Students{
    int rollno;
    String name;
}

public class array_obj {
    public static void main(String[] args) {

        //OBJECT CREATION

        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        s1.name = "ashutosh";
        s1.rollno= 21;

        s2.name = "karan";
        s2.rollno= 22;

        s3.name = "sarfarz";
        s3.rollno= 25;

        /*
         * if want o display only one sesult then we had done
         * System.out.println(s1.name + ":" +s1.rollno);
         */

        //(ARRAY)OBJECT CREATION

        Students student[] = new Students[3];  //array are objects in java
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for(int i=0;i<student.length;i++){
            System.out.println(student[i].name + ":" +student[i].rollno);
        }

        System.out.println();

        for(Students stud : student){          //
            System.out.println(stud.name + ":" + stud.rollno);
        }
    }
}
