package EstateAgent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PropertyManagement{
    public static String pType;
    public static Integer newPrice = 0;
    public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    ArrayOfProperties myArray = new ArrayOfProperties();

    Property property1 = new Property("abc", "Belfast", "BT367EY", "Semi-detached House", "Terrence", "07749283718", 150000);
    myArray.insert(property1);
    Property property2 = new Property("15 Roman Way", "Liverpool", "BT23T16", "Bungalow", "Julie", "07949981013", 165000);
    myArray.insert(property2);
    Property property3 = new Property("428 Congue Road", "New York", "54486", "Detached" ,"Robert", "07773880192", 275000);
    myArray.insert(property3);
    Property property4 = new Property("527-381 Urna Road", "Chicago", "60607", "Detached House", "Ashley", "631-504-1779", 320000);
    myArray.insert(property4);
    Property property5 = new Property("9701 Suspendisse Ave", "New York", "54249", "Semi-detached House", "Andrew", "402-302-1991", 300000);
    myArray.insert(property5);
    menuuu(myArray);
    }
    public static String validateStrings(String input){
        return input;
    }
    public static String validatePhone(String input){
        Scanner phone = new Scanner(System.in);
        String newNumber = phone.nextLine();
        do{
        if (input.length() != 11){                                
            System.out.println("Enter valid 11 Digit Phone Number");
            input = phone.nextLine();
        } 
            } while (input.length() != 11);
        return input;
    }
    public static void searchForStreet(String street, int position, ArrayList properties)
    {

    }

    public static void passwordCheck()
    {
                Scanner keyboard = new Scanner(System.in);
                String pass = "P";
                System.out.println("Please enter password: ");
                String password = keyboard.nextLine();
                if (!(password.equals(pass))){
                    do{
                        System.out.println("Please enter correct password: "); 
                        password = keyboard.nextLine();
                    }
                    while (!(password.equals(pass)));}
                return;
    }
    public static void menuuu(ArrayOfProperties myArray)
    {
    //String[][] options = { {str(1), "List All Properties"},{str(2), "Search for a Property by Town"}, {str(3), "Register for a New Property"}, {4, "Edit Details of a Property"}, {5, "Delete a Property"}, {6, "Exit"}};
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        int choice = 10;
        //int[] menu = {1, 2, 3, 4, 5, 6};
        do {
            System.out.println("*** AMM Estate Agents ***");
            System.out.println("1 - List All Properties");
            System.out.println("2 - Search for a Property by Town");
            System.out.println("3 - Register for a New Property");
            System.out.println("4 - Edit Details of a Property");
            System.out.println("5 - Delete a Property");
            System.out.println("6 - Exit");
            System.out.println("Enter your choice: ");
            System.out.println("QUE?");
        try {
            input = keyboard.nextLine();
            choice = Integer.parseInt(input);
        
        } catch (NumberFormatException e)
        {
        System.out.println("");
        System.out.println("Please enter a valid input.");
        System.out.println("");
        }
            if (choice == 2){
                String town = keyboard.nextLine();
                //System.out.print(myArray.findPropertyByTown(town));
            }
            else if (choice == 3)
            {
                String password = keyboard.nextLine();
            }
            else if (choice ==4)
            {
                String password = keyboard.nextLine();
            }
            else if (choice == 5)
            {
                String password = keyboard.nextLine();
            }
            switch(choice){

                case 1:
                    myArray.displayAllProperties();
                    menuuu(myArray);
                case 2:
                    System.out.println("Please enter town: ");
                    String town = keyboard.nextLine();
                    ArrayList<Integer> answer = myArray.findPropertyByTown(town);
                    if (answer.size() > 0){
                    
                    for (int i = 0; i < answer.size(); i++){
                        myArray.displayAProperty(answer.get(i));
                    }
                    }
                    else{
                        System.out.println("No Property Found for " + town);
                    }
                    break;
                case 3:
                    passwordCheck();
                    System.out.println("Full Line of Address: ");
                    String pStreet = keyboard.nextLine();
                    for (int count=0; count < myArray.getNoOfProperties(); count++){
                    if (myArray.getCurrent(count).getStreet().equals(pStreet)){
                        do{
                        System.out.println("Current Property Exists.");
                        System.out.println("New Property Street: ");
                        pStreet = keyboard.nextLine();
                        } while (pStreet.equals(myArray.getCurrent(count).getStreet()));
                    }}
                    System.out.println("Town: ");
                    String pTown = keyboard.nextLine();
                    System.out.println("Postcode: ");
                    String pPostcode = keyboard.nextLine();
                    System.out.println("New Property Type: ");
                    System.out.println("1 - Detached ");
                    System.out.println("2 -  Semi-detached");
                    System.out.println("3 - Apartment");
                    System.out.println("4 - Terrace");
                    int pTypeChoice = keyboard.nextInt();
                    do{
                    switch (pTypeChoice){
                        case 1:
                            pType = "Detached";
                            System.out.println(pType);
                            break;
                        case 2:
                            pType = "Semi-detached";
                            System.out.println(pType);
                            break;
                        case 3:
                            pType = "Apartment";
                            System.out.println(pType);
                            break;
                        case 4:
                            pType = "Terrace";
                            System.out.println(pType);
                            break;
                        default: 
                            System.out.println("Please enter a valid input: ");
                            pTypeChoice = keyboard.nextInt();
                    } 
                    } while ((pTypeChoice > 4) || (pTypeChoice < 0));

                    System.out.println("Vendor: ");
                    String pVendorName = "";
                    if (pVendorName.length() == 0){
                        do {
                            pVendorName = keyboard.nextLine();
                        } while (pVendorName.length() == 0);
                }
                    System.out.println("Vendor's Contact Number: ");
                    String pVendorNumber = keyboard.nextLine();
                    // VALIDATE PHONE
                    validatePhone(pVendorName);

                    System.out.println("Property price: ");
                    String price = "";
                    boolean isInt = false;
                    while (!isInt){
                    try {
                        price = keyboard.nextLine();
                        Integer pPrice = Integer.parseInt(price);
                        Property street = new Property(pStreet, pTown, pPostcode, pType, pVendorName, pVendorNumber, pPrice);
                        myArray.insert(street);
                        isInt = true;
                        break;

                    } catch (NumberFormatException e) {
                        System.out.println("Numeric Data ONLY: ");
                        isInt = false;
                    } 
} break;
                case 4:
                    passwordCheck();
                    System.out.println("What is the first line of the address you wish to change details?");
                    String streetEdit = keyboard.nextLine();
                    for (int i = 0; i < myArray.getNoOfProperties(); i++)
                    {
                        myArray.getStreet(i);
                        if (streetEdit.equals(myArray.getStreet(i))){
                            System.out.print("CURRENT ");
                            myArray.displayAProperty(i);
                            break;
                    } 
                        else {System.out.println("No match.");}
                    
                    }
                while (true)
                {
                System.out.println("What would you like to edit?");
                System.out.println("1 - Vendor Phone Number");
                System.out.println("2 - Property Price");
                System.out.println("3 - Main Menu");
                int editMenu = 0;
                    do{
                        String edit = "";
                        isInt = false;
                        while (!isInt) 
                        {
                        try {
                            edit = keyboard.nextLine();
                            editMenu = Integer.parseInt(edit);
                            isInt = true;
                    } catch (NumberFormatException e) 
                    {
                        System.out.println("Numeric Data ONLY: ");
                        isInt = false;
                    }   
                         }
                        if (!(editMenu == 1) && !(editMenu == 2) && !(editMenu == 3))
                        {
                            System.out.println("Choose a valid input: ");
                            try {
                                edit = keyboard.nextLine();
                                editMenu = Integer.parseInt(edit);
                                isInt = true;
                                break;} 
                            catch (NumberFormatException e) 
                            {
                            System.out.println("Numeric Data ONLY: ");
                            }
                        }
                    } while (!(editMenu == 1) && !(editMenu == 2) && !(editMenu == 3));
                    for (int i = 0; i < myArray.getNoOfProperties(); i++)
                    {
                            //myArray.getStreet(i);
                            if (streetEdit.equals(myArray.getStreet(i))){
                                if (editMenu == 1 )
                                {
                                    System.out.println("Enter New Vendor Phone Number ");
                                    String newNumber = keyboard.nextLine();
                                    if (newNumber.length() != 11)
                                    {                                
                                        validatePhone(newNumber);
                                    }
                                    myArray.getCurrent(i).setVendorContactNumber(newNumber);
                                    System.out.println(myArray.getCurrent(i).getVendorContactNumber());

                                    
                                }
                                
                                else if (editMenu == 2)
                                {
                                    System.out.println("Enter New Property Price: ");
                                    int newPrice;
                                    price = "";
                                    isInt = false;
                                    while (!isInt)
                                    {
                                    try {
                                        price = keyboard.nextLine();
                                        newPrice = Integer.parseInt(price);
                                        if (newPrice <= 0)
                                        {          
                                        do{
                                            System.out.println("Enter Property Price: ");
                                            newPrice = keyboard.nextInt();
                                        } while (newPrice <= 0);
                                        } 
                                    myArray.getCurrent(i).setPrice(newPrice);
                                    System.out.println(myArray.getCurrent(i).getPrice());
                                    myArray.getCurrent(i).displayProperty();
                                    } catch (NumberFormatException e) 
                                    {
                                    System.out.println("Numeric Data ONLY: ");
                                    isInt = false;
                                    }

                                    }
                                }
                                else if (editMenu == 3)
                                {
                                System.out.println("Main Menu");
                                    menuuu(myArray);
                                }
                        continue; 
                    }
                    } while (!(editMenu ==1) && !(editMenu == 2) && !(editMenu == 3));
                } 
    

                case 5:
                    passwordCheck();
                    System.out.println("Please enter Property Address: ");
                    String dStreet = keyboard.nextLine();
                    for (int i = 0; i < myArray.getNoOfProperties(); i++)
                    {
                        myArray.getStreet(i);
                        if (dStreet.equals(myArray.getStreet(i))){
                            myArray.getCurrent(i).displayProperty();
                            System.out.println("Do you wish to delete this Property? (Y/N): ");
                            char delete = keyboard.next().charAt(0);
                            do{
                                if ((delete == 'Y') || (delete == 'y'))
                                {
                                        myArray.removeProperty(i);
                                        break;
                                }
                                else break;
    
                            } while (true);
                        }
                        else { 
                            System.out.println("*** Property Address not found ***");
                            break;
                        }
                    break;
                    }
                case 6:
                    break;
            }
        } while (choice != 6);
    }
}



