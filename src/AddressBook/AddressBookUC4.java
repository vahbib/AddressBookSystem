package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC4 {
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		AddressBook obj = new AddressBook();
		while(true) {
    
	        System.out.println("1. Add Address.\n2. Display The Details.\n3. Edit a Detail.\n4. Remove a detail.");
	        System.out.println("Enter your choice: ");
	        int n = Integer.parseInt(sc.nextLine());
	      
	        if(n==1) {
	        
		        System.out.println("Enter the First Name:");
		        String first = sc.nextLine();
		            
		        System.out.println("Enter the Last Name:");
		        String last = sc.nextLine();
		            
		        System.out.println("Enter the Phone No.:");
		        long num = Long.parseLong(sc.nextLine());
		            
		        System.out.println("Enter the Email:");
		        String email = sc.nextLine();
		        
		        System.out.println("Enter the Address:");
		        String add = sc.nextLine();
		        
		        System.out.println("Enter the City:");
		        String city = sc.nextLine();
		        
		        System.out.println("Enter the State:");
		        String state = sc.nextLine();
		        
		        System.out.println("Enter the Zip Code:");
		        long zp = Long.parseLong(sc.nextLine());
		            
		        Details adrs = new Details(first,last,num,email, add, city, state, zp);
		        obj.addDetails(adrs);
	        }
	        else if(n==2) {
	        	System.out.println("The Details in the List are:");
	        	ArrayList<Details> list = (ArrayList<Details>)obj.viewAllDetails();
	            for(Details c:list)
	            System.out.println("First Name: "+c.getFirstName()+"\nLast Name: "+c.getLastName()+"\nPhone no.: "+c.getPhoneNumber()+"\nEmail: "+c.getEmailId()+"\nAddress: " + c.getAddress()+"\nCity: "+c.getCity()+"\nState: "+c.getState()+"\nState: "+c.getState()+"\nZip Code: "+c.getZipCode());
	        }
	        else if (n==3) {
	        	System.out.println("Enter the First Name to Edit the Details");
	        	String fN = sc.nextLine();
	        	ArrayList<Details> list = (ArrayList<Details>)obj.viewAllDetails();
	            for(Details c:list)
	            	if (c.getFirstName().equals(fN)) {
	            		obj.edit(c); 
	            	}
	        }
	        else if(n==4) {
	        	System.out.println("Enter the First Name to remove :");
                String first = sc.nextLine();
                System.out.println("Do you want to remove the Detail (Y/N):");
                String ans = sc.nextLine();
                if (ans.equals("Y")) {
                    if(obj.removeDetails(first))
                    System.out.println("The Address Detail is successfully deleted.");
                } 
	        }
	        else {
	        	System.out.println("PLease Enetr a Valid Number.\nThankYou!");
	        	break;
	        }
	    }

  }

}
