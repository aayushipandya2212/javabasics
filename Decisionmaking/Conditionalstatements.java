package Decisionmaking;


public class Conditionalstatements {
    public static void main(String[] args)
    {
        ifelse();
        nestedif();
        ifelseif();
        switchcase();
    }

    public static void ifelse()
    {
        int i = 30;

        if (i < 15)
            System.out.println(i + " is smaller than 15");
        else
            System.out.println(i + " is greater than 15");
    }


    public static void nestedif() {
        int i = 10;

        if (i == 10) {
            // First if statement
            if (i < 15)
                System.out.println(i + " is smaller than 15");
            if (i < 12)
                System.out.println(i + " is smaller than 12 too");
            else
                System.out.println(i + " is greater than 15");
        }
    }

        public static void ifelseif()
        {

            int i = 30;

            if (i == 10)
                System.out.println("i is 10");
            else if (i == 15)
                System.out.println("i is 15");
            else if (i == 20)
                System.out.println("i is 20");
            else
                System.out.println(i + " is not present");
        }
        
        public static void switchcase()
        {
            int i = 2;
            switch (i)
            {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                default:
                    System.out.println(i + " is greater than 2.");
            }
           }
}