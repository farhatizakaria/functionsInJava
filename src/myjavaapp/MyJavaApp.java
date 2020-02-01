
package myjavaapp;

/**
 *
 * @author Zakaria Farhati
 */
public class MyJavaApp {

    
    public static void main(String[] args) {
       String name = "zakaria";
       sayHello(name,true);
       
       int mySum= sum(1,2);
       System.out.print(mySum);
       
    }
    
        
    public static int sum(int a, int b)
    {
        // public static int ==> That's mean this function will
        // return an integer value (sum)
        int result = a + b;
        return result;
    }
    public static void sayHello(String name, Boolean isMale) {
        // public static void ==> That's mean the function won't 
        // return any value
        if (isMale == true) {
            System.out.print("Mr, " + name);
        } else {
            System.out.print("Mss, " + name);
        }
    
    }
    
}
