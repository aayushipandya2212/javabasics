package variables;

public class Globalvariable 
{
    // global variable age
        static int age = 0;
        
    public static void StudentAge()
    {
        age = age + 5;
        System.out.println("Student age is : " + age);
    }

    public static void main(String args[])
    {

        StudentAge();
       // System.out.println("Student age is : " + age);  if we access the global variable from outside the block of function student age
    }
}
