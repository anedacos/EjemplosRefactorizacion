package diseñodesoftware;

import java.util.Enumeration;
import java.util.Vector;
public class Customer{
	String name;
	Vector rentals;
	
	public Customer( String name ) {
		this.name = name;
		this.rentals = new Vector();
	}
	
	public Vector getRentals(){
		return rentals;
	}
	public String getName(){
		return name;
	}
        public void codigoDuplicado(String result,double totalCharge,int frequentRenterPoints){            
		 String customerName=this.getName();		 
		 Enumeration entries = rentals.elements();
		 while ( entries.hasMoreElements() )
		 {
			 Rental each = (Rental) entries.nextElement();
			 double rentalCharge = each.charge();
			 frequentRenterPoints += each.frequentRenterPoints();
			 // show figures for this rental
			 result += "\t" + each.getMovie().getTitle() +
			 "\t" + String.valueOf(rentalCharge) + "\n";
			 totalCharge += rentalCharge;
		 }		 
        }
	
	public String statement() {
                 int frequentRenterPoints = 0;
		 double totalCharge = 0;
		 String result = "Rental Record for " + getName() + "\n";
		 codigoDuplicado(result,totalCharge,frequentRenterPoints);
		 result += "Amount owed is " + String.valueOf(totalCharge) + "\n";
		 result += "You earned " + String.valueOf(frequentRenterPoints) +
		 " frequent renter points";
		 return result;
	}
	
	public String htmlStatement(){
		 double totalCharge = 0;
		 int frequentRenterPoints = 0;
		 String customerName=this.getName();
		 String result = "<HTML>\n<TITLE>Rental Record</TITLE>\n" +
		 "<BODY>\n" +
		 "<H1>Rental Record for <EM>" + customerName +
		 "</EM></H1>\n<P>";		 
		 codigoDuplicado(result,totalCharge,frequentRenterPoints);
		 result += "</P>\n<P> You owe <EM>" + String.valueOf(totalCharge) +
		 "</EM></P>\n<P>On this rental, you earned <EM>" +
		 String.valueOf(frequentRenterPoints) +
		 "</EM> frequent renter points.</P>\n</BODY>\n</HTML>";
		 return result;
		 }
}