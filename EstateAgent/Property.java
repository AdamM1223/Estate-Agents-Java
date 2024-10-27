package EstateAgent;

import java.text.SimpleDateFormat;
import java.util.Date;

   /**
    *  Created by Adam McCavana on 28/02/2023
    *  This class is used to create and store information and attributes for properties, any records created from this class
    *  can store valuable data in the many preset declared variables. This class contains getters and setters so the user
    *  can obtain specific details about any property as they please. As well as containing a method for obtaining the full
    *  address for any property. The final piece of this class is a method that will display all of the stored
    *  information about any property, to allow for a more efficient overview.
    */

   public class Property   // Declaring the creation of a class Property
   {
      // Private variables are declared to be used within this class when creating more properties
      private String street;
      private String town;
      private String postcode;
      private String propertyType;
      private String nameOfVendor;
      private String vendorContactNumber;
      private int price;
      private Date dateRegistered;

      // Default Constructor is declared which lets the software know what parameters to pass in for a new object to be created
      public Property(String pStreet, String pTown, String pPostcode, String pPropertyType, String pNameOfVendor, String pVendorNumber, int pPrice)
      {
         street = pStreet;
         town = pTown;
         postcode = pPostcode;
         propertyType = pPropertyType;
         nameOfVendor = pNameOfVendor;
         vendorContactNumber = pVendorNumber;
         price = pPrice;
         dateRegistered = new Date();
         /** Date registered is automatically assigned to the date on which the object is created
          *using the following code, this is formatted further down the program */
      } // End of constructor


      // Setters are declared allowing us to change any specific detail if anything is to need updated or edited
      // Each value has its own setter to allow for easier modification
      protected void setStreet(String pStreet)
      {
         street = pStreet;
      }
      protected void setTown(String pTown) { town = pTown;}
      protected void setPostcode(String pPostcode)
      {
         postcode = pPostcode;
      }
      protected void setPropertyType(String pPropertyType)
      {
         propertyType = pPropertyType;
      }
      protected void setNameOfVendor(String pNameOfVendor)
      {
         nameOfVendor = pNameOfVendor;
      }
      protected void setVendorContactNumber(String pVendorNumber)
      {
         vendorContactNumber = pVendorNumber;
      }
      protected void setPrice(int pPrice)
      {
         price = pPrice;
      }

      /**Getters are used to retrieve data. these allow the user to request any specific piece
       * of information about a property and these getters will return the appropriate value  */
      protected String getStreet()
      {
         return street;
      }
      protected String getTown()
      {
         return town;
      }
      protected String getPostcode()
      {
         return postcode;
      }
      protected String getPropertyType()
      {
         return propertyType;
      }
      protected String getNameOfVendor()
      {
         return nameOfVendor;
      }
      protected String getVendorContactNumber()
      {
         return vendorContactNumber;
      }
      protected int getPrice() { return price; }
      protected Date getDateRegistered() { return dateRegistered; }

      /** getFullAddress Method was created to combine individual pieces of information about the address into one
       * larger complete piece of information. This saves calling upon 3 different piece of information manually and allows
       * for quicker access to the information. */
      // This is done by combining the variables into one larger string, and formatting appropriately
      protected String getFullAddress()
      {
         String fullAddress = getStreet() + ", " + getTown() + ", " + getPostcode();
         return fullAddress;
      }

      /** displayProperty method is created as a way of viewing every held piece of information about a specific property
       * in one quick action. This ensures the user does not have to type out 6 different pieces of information separately
       * but instead one quick line of code. This is formatted to be laid out neatly allowing the user to understand
       * the information quickly and easily. */
      protected void displayProperty() // Method to print out all stored information about a property
      {
         /** This declares a String variable which is used to format the date registered
          to an easier to read format, 'dd-MM-yyyy', this is used for the final output of all
          property details to the user */
         String dateReg = new SimpleDateFormat("dd-MM-yyyy").format(dateRegistered);

         /** The following commands will display the different stored variables of the Property using
          the getters to accurately return the information */

         System.out.println("PROPERTY INFORMATION");
         System.out.println("======================");
         System.out.println("The address of this property is: " + getFullAddress());
         System.out.println("The property type is: " + getPropertyType());
         System.out.println("The price of this property is: " + getPrice());
         System.out.println("The date this property was registered is: " + dateReg);
         System.out.println("The name of the vendor for this property is: " + getNameOfVendor());
         System.out.println("The contact number for " + getNameOfVendor() + " is: " + getVendorContactNumber());
      }

   }  // This is the end of the Property class
