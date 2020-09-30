package AddressBook;

import java.util.*;

public class AddressBookUC2 {
	public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			AddressBook obj = new AddressBook();
			while(true) {
	    
		        System.out.println("1. Add Address.\n2. Display The Details.");
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
		        else {
		        	System.out.println("PLease Enetr a Valid Number.\nThank You!");
		        	break;
		        }
		    }
	
	  }

}
