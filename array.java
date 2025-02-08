import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

       
        int a[][] = new int[m][n];

        /*jagged array is a array whose n(here) varies 
         * so we declera it in different way
         * 
         * int a[][] = new int[m][];
         * a[0]= new int[2]; 
         * a[1]= new int[3];
         * a[2]= new int[5];
         * 
         * 0th array of length 2....1st array of length 3.....
         */

        for(i=0;i<m;i++){                             // here we'll write i<a.length
            for(j=0;j<n;j++){                         //i<a[i].length
                a[i][j] = (int)(Math.random() * 10) ; //type casting of random value is done random value gives value below 1 and so its in decimal form
            }
        }    

        for(i=0;i<m;i++){                            // here we'll write i<a.length
            for(j=0;j<n;j++){                        //i<a[i].length
                System.out.print(a[i][j] + " ");
            
            }        
            System.out.println();
        }
        System.out.println();

        //ENHANCED LOOP..................dont have to change anythig here

        for(int l[] : a){
            for(int k : l){
                System.out.print(k + " ");
            
            }        
            System.out.println();
            } 
        
    }
}

