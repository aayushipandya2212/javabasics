package operators;

public class Shiftoperators 
{
    public static void main(String args[])
    {
        leftshift();
        rightshift();
    }


    public static void leftshift()
    {
        System.out.println(10<<2);
        System.out.println(10<<3);
        System.out.println(-5>>3);
     }


    public static void rightshift()
    {
        System.out.println(10>>2);
        System.out.println(20>>2);
        System.out.println(-20>>3);
    }
}
