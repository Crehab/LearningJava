public class swapTwoVariables 
{
    public static void main(String arg[])
    {
      System.out.println("Before Swapping.");
      int X = 1;
      int Y = 2;
      System.out.println("X : "+X);
      System.out.println("Y : "+Y);

      int temp;
      
      temp = X; // put x into temp.
      X = Y; // put Y into X.
      Y = temp; // put temp into Y.
      System.out.println("After Swapping by using temp Variable.");
      System.out.println("X : "+X);
      System.out.println("Y : "+Y);
    }
}
