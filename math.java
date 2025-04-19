
public class math {

    public static void main(String arg[]) {
        //this program prints the maximum number for integer
        int a = 10;
        int b = 33;
        int z = Math.max(a, b);
        System.out.println("Max : " + z);
        //this program finds the minimum number for integer.
        int a1 = 11;
        int b1 = 22;
        int z1 = Math.min(a1, b1);
        System.out.println("Min : " + z1);
        //this program will display absolute value of an given double number.
        double a2 = 3.44;
        double b2 = -33;
        double z2 = Math.abs(a2);
        double z2i = Math.abs(b2);
        System.out.println("Absolute Value of a2 is: " + z2);
        System.out.println("Absolute Value of b2 is: " + z2i);

        // Squareroot Function
        double a3 = 3;
        double z3 = Math.sqrt(a3);
        System.out.println("Squareroot of 3 is: " + z3);

        // Round a Number.
        double a4 = 32.32;
        double z4 = Math.round(a4);
        System.out.println("Round of a4 is : " + z4);

    }
}
