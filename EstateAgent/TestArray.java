package EstateAgent;
import java.util.Scanner;

/**
 * Created by 60027330 on 14/03/2023
 *
 */
public class TestArray
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      '''ArrayOfProperties myArray = new ArrayOfProperties();
      '''

      // Create a student object
      Property student1 = new Property("John", "494", "593", "43", "524","4224", 2442);
      // Add student to the array
      myArray.insert(student1);

      // Create a new student object
      Property student2 = new Property("d3r", "larne", "43", "424", "532","43",5050);
      myArray.insert(student2);

      Property student3 = new Property("r3","larne","53","jf","fj","gog",502);
      myArray.insert(student3);
      System.out.print(myArray.getCurrent(1));
      // Output details of all students
      System.out.print("There are: " + myArray.getNoOfProperties() + " properties.");
      myArray.displayAllProperties();
      System.out.println("Array list for Town Larne: ");
      System.out.println(myArray.findPropertyByTown("larne"));
      System.out.println("Property by Street: ");
      System.out.print(myArray.findPropertyByStreet("d3r"));
      System.out.println("");
      myArray.displayAProperty(0);
      myArray.displayAllProperties();


   }
} //class
