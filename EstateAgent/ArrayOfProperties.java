package EstateAgent;
import java.util.List; // Imports of Java lists and ArrayLists
import java.util.ArrayList;

/**
 * Created by Adam McC on 14/03/2023
 * This program was created to create a class which is used to create an array of properties
 * that are within our Property class. Alongside the ArrayList I declare, there are many methods created
 * to retrieve information from this list that allow the user to specify the index inside the list they would
 * like to view
 */
public class ArrayOfProperties // Declares public class ArrayOfProperties
{
   private List<Property> properties; // Creating a private List known as properties

   public ArrayOfProperties() // Creating an ArrayOfProperties class
   {
      properties = new ArrayList<Property>();   // Defining properties list as a new Array List
   }  // ArrayOfProperties Default Constructor

   protected Property getCurrent(int position)
   {
      return properties.get(position);
   } // getCurrent Method

   protected int getNoOfProperties()
   {
      return properties.size();
   } // getNoOfProperties Method

   protected String getStreet(int position)
   {
      return properties.get(position).getStreet();
   } // getStreet Method

   protected void insert(Property newProperty)
   // This method is used to add any new property objects to the Array List Properties
   {
      properties.add(newProperty);
      System.out.println(newProperty.getFullAddress() + " Added."); // Lets the user know the property has been added
   } // insert Method

   protected void removeProperty(int position)
   // This method is used to remove any existing properties from the existing Array List using the index of this property
   {
      System.out.print(properties.get(position).getStreet() + "- Property Removed.");
      properties.remove(position);
   } // removeProperty Method

   protected int findPropertyByStreet(String street)
   /** This method is used to search through the properties list using a String parameter, this
   * runs through a for loop and then returns the index of the first Property that matches the parameter
    value */
   {
      // declare variables which are used to control the following loops
      int index = 0;
      boolean found = false;
      int position = -1;
      do  // Initiates a do while loop
      {
         for (index = 0; index < properties.size(); index++)
            // This loop will run through the length of the properties list so each property is checked
         {
            if (street.equals(properties.get(index).getStreet()))
               // If the Parameter is equal to the already stored street value, the if statement will be true, hence running the code below
            {
               found = true;
               position = index; // stores the position in which the Street values match
               break;   // break in the loop, which allows for us to return the position variable below
            }  // If
         }  // For
      } // Do
      while (!found && index < getNoOfProperties()); // while conditions that the do loop follows while looping
         return position; // Return the variable position, which will return as -1 if the loop does not find an appropriate answer
   } // findPropertyByStreet Method

   protected ArrayList<Integer> findPropertyByTown(String town)
   /** This is a method to find properties by town using the String parameter, this is used to run through
    * a loop of all the properties and compare the stored information against the Parameter. If these values match,
    * the index of the corresponding Property is added to a new list known as result. This is returned at the end of
    * the method */
   {
      ArrayList<Integer> result = new ArrayList<Integer>(); // Declare a new Array List known as result

         for (int index = 0; index < getNoOfProperties(); index++) // for loop to iterate through all the properties
         {
            if (properties.get(index).getTown().equals(town))
               // If statement to check if the stored Town variable matches the Parameter we are using to search
            {
               result.add(index);   // If these values match then the index is added to the result list
            } // if
         } // for
      return result; // The result list is returned to the user once this loop has been completed
   } // findPropertyByTown method

  protected void displayAProperty(int position)
  /** This method uses the inputted parameter to search and retrieve the data for the property
   * that sits at the index equal to the position parameter. This property then uses the
   * displayProperty method from Property.java to display all the available information
   */
  {
     properties.get(position).displayProperty();

  }   // displayAProperty Method

  protected void displayAllProperties()
  /** This method is used to display the information of all the properties that are
   * stored in the properties list, this is done using a for loop to iterate through all
   * the properties, and then uses the displayProperty method for each property */
  {
     for (Property someProperty : properties)
     {
        someProperty.displayProperty();
     }
  }   // displayAllProperties Method
} //class
