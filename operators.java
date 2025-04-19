/* expression = operands and operators
 * operands = 12345, values, quantity, variables etc
 * operators = + - * / 
 */
public class operators 
{
  public static void main(String arg[])
  {
    // + operator
    int age = 21;
    System.out.println("current age: "+age);
    age = age + 1; // alternatively, age++;
    System.out.println("New age: "+age);

    // - operator
    age = age - 1; // age--;
    System.out.println("New age value now is : " +age);

    int age2 = 22;
    System.out.println("age2 is: "+age2);
// cannot show the decimal portion with integer divison.    
    age2 = age2 / 3;
    System.out.println("age2 will be : "+age2); 
    
    double liquidity = 25;
    System.out.println("liquidity is : "+liquidity);
    liquidity = liquidity / 2;
    //shows the decimal portion of the given double.59
    
    System.out.println("liquidity now is : "+liquidity);
  }
}
