import java.util.Scanner;
public class mathProject 
{
    public static void main (String args[])
    {
        double X;
        double Y;
        double Z;

        Scanner Scanf = new Scanner(System.in);
        
        System.out.println("enter side x: ");
        X = Scanf.nextDouble();
        System.out.println("enter side y: ");
        Y = Scanf.nextDouble();
        System.out.println("enter side Z: ");
        Z = Math.sqrt((X*X) + (Y*Y));
        System.out.println("the hypotenuse is "+Z);

        Scanf.close();

    }
}
