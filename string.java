public class string {
    public static void main(String[] args) {
        
        //THE TYPES OF DECLERATION OF STRING

        String name = new String("navin");

        String s1 = "Navin";
        String s2 = "Navin";

        name = name + " reddy";

        System.out.println(name);
        System.out.println(s1==s2); // CHECKING STRING CONSTANT POOL
        System.out.println();
        // STRINGBUFFER

        StringBuffer str = new StringBuffer("kallu");
        str.append(" reddy");  //add in the end of the string
        System.out.println(str);
        System.out.println(str.capacity());  //extra capacity for future modification
        System.out.println(str.length());

        String s3 = str.toString(); //converted to string 
        
    }
}

//the stack in jvm contains the variable s1 and s2 which has the adress of the srting which they are using.....
//There is somethinng called STRING CONSTANT POOL which contains the strings is the same string comes again then it assigns the adress of existing string 