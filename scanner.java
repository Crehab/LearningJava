import java.util.Scanner;
public class scanner 
{
  public static void main(String arg [])
  {
    Scanner scanThisShit = new Scanner(System.in);
    System.out.println("the name ?");
    String name = scanThisShit.nextLine();
    System.out.println("fr ?");
    System.out.println("whats the number? ");
    Long Number = scanThisShit.nextLong();
/*after nextInt there's still a newline and we 
need to clear it out first in order 
get the string input from the user.*/ 
    scanThisShit.nextLine(); 
    // to clear out the extra newline.
    System.out.println("the address ? ");
    String address = scanThisShit.nextLine();
    System.out.println("So the name is " +name+ " and the number is "+Number);
    System.out.println("this is the address:- "+address);
    scanThisShit.close();
  }
}  
