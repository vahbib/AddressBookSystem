package AddressBook;

import java.util.*;

public class AddressBook {
	
	Scanner sc = new Scanner(System.in);

    private List<Details> addressBook = new ArrayList<Details>();
    public List<Details> getAddressBook() {
        return this.addressBook;
    }
    public void setAddressBook(List<Details> adrs) {
        this.addressBook = adrs;
    }
    public void addDetails(Details detailsObj) {
        addressBook.add(detailsObj); // ADDING DETAILS
    }
    public List<Details> viewAllDetails() {
        return addressBook;
    }
    // DISPLAYING DETAILS
    public Details viewDetailsGivenName(String firstName) {
        for(Details c:addressBook)
        if (c.getFirstName()== firstName)
        	return c;
        
        return null;
    }
    //  TO EDIT EXISTING DETAILS
    public void edit(Details det) {
    	System.out.println("1. Enter the First Name.");
    	System.out.println("2. Enter the Last Name.");
    	System.out.println("3. Enter the Phone Number.");
    	System.out.println("4. Enter the Email ID.");
    	System.out.println("5. Enter the Address.");
    	System.out.println("6. Enter the City.");
    	System.out.println("7. Enter the State.");
    	System.out.println("8. Enter the Zip Code.");
    	
    	System.out.println("Enter Number of Correspondence Statement.");
    	
    	int choice = sc.nextInt(); sc.nextLine();
    	System.out.println("Enter the Detail");
    	
    	switch (choice) {
	    	case 1:
	    		updateDetailsFirstName(det, sc.nextLine());
	    		break;
	    	case 2:
	    		updateDetailsLastName(det, sc.nextLine());
	    		break;
	    	case 3:
	    		updateDetailsPhoneNumber(det, Long.parseLong(sc.nextLine()));
	    		break;
	    	case 4:
	    		updateDetailsEmail(det, sc.nextLine());
	    		break;
	    	case 5:
	    		updateDetailsAddress(det, sc.nextLine());
	    		break;
	    	case 6:
	    		updateDetailsCity(det, sc.nextLine());
	    		break;
	    	case 7:
	    		updateDetailsState(det, sc.nextLine());
	    		break;
	    	case 8:
	    		updateDetailsZip(det, Long.parseLong(sc.nextLine()));
	    		break;
	    	default:
	    		System.out.println("INVALID INPUT");
	    		break;
    	}
    	
    	
    }
    public void updateDetailsPhoneNumber(Details dObj, long phoneNumber)  {
        dObj.setPhoneNumber(phoneNumber);
    }
    public void updateDetailsFirstName( Details dobj, String upFirstName)  {
        dobj.setFirstName(upFirstName);
    }
    public void updateDetailsLastName(Details dObj, String lastName)  {
        dObj.setLastName(lastName);
    }
    public void updateDetailsEmail(Details dObj, String email)  {
        dObj.setEmailId(email);
    }
    public void updateDetailsCity(Details dObj, String city)  {
        dObj.setCity(city);
    }
    public void updateDetailsAddress(Details dObj, String address)  {
        dObj.setAddress(address);
    }
    public void updateDetailsState(Details dObj, String state)  {
        dObj.setState(state);
    }
    public void updateDetailsZip(Details dObj, long zip)  {
        dObj.setZipCode(zip);
    }
    // REMOVING ANY DETAIL
    public boolean removeDetails(String firstName) {
        for(Details c:addressBook)
        if(c.getFirstName()== firstName)
        {
            addressBook.remove(c);
            return true;
        }
        return false;
    }

}
