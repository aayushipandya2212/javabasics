package Decisionmaking;


public class Loops {
    public static void main(String[] args)
    {
        forloop();
        foreachloop();
        labeledforloop();
        whileloop();
        dowhileloop();
    }

    public static void forloop()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=4;j<=6;j++)
            {
                System.out.println(i+" "+j);
            }
        }
    }

    public static void foreachloop()
    {
        int array[]={18,3,66,78,99};
        for(int i:array){
            System.out.println(i+1);
        }
    }


    public static void labeledforloop()
    {
        loop1:
        for(int i=1;i<=3;i++){
            loop2:
            for(int j=1;j<=3;j++)
            {
                if(i==2&&j==2)
                {
                    break loop1;
                }
                System.out.println(i+" "+j);
            }
        }
}

    public static void whileloop()
    {
        int x = 1;
        while (x <= 4)
        {
            System.out.println("Value of x:" + x);
            x++;
        }
     }


    public static void dowhileloop()
    {
        int x = 25;
        do
        {
            System.out.println("Value of x:" + x);
            x--;
        }
        while (x > 20);
    }
}
