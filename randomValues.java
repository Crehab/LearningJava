import java.util.Random;
public class randomValues 
{
  public static void main(String args[])
  {
    Random random = new Random();
    // these are pseudoRandom Numbers, close to Random Numbers.
    int x = random.nextInt();
    System.out.println("Random Numbers: "+x);
    // results are under -2 billon to +2 billon.

    // lets pretend that we want a random number between 0 to 6
    // from a 6 sided dice.

    int dice = random.nextInt(6)+1;
    // Computers always start with 0, so we add 1 to start the counting from 1.
    System.out.println("Side of the Dice: "+dice);

    double y = random.nextDouble();
    System.out.println("Random Double Value: "+y);

    boolean z = random.nextBoolean();
    System.out.println("Random Boolean Values: "+z);
  }  
  
}
