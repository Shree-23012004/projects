import java.util.Scanner;

public class comm
{
    public static void main(String[] args)
    {
        System.out.println("total no of argu is "+args.length);
        System.out.println("command lie is ");
        int i;
        for(i=0;i<args.length;i++) {
            System.out.println("argument " + (i + 1) + ": " + args[i]);
        }
    }
}
