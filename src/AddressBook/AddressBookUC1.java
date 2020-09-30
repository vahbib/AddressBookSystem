package AddressBook;

import java.util.Scanner;

public class AddressBookUC1 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		AddressBook obj = new AddressBook();
    
        System.out.println("Add Address.\n");
        
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

     }

}
