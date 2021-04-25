/*class MovieTicketBooking similar to home page.
Both admin and registered user(s) can sign in using the same interface.
Visitor can straight away select details.*/
public class MovieTicketBooking {
	static int userChoice = 0;
	
	public static void main(String[] args){
		Login login = new Login();
		System.out.println("******** MOVIE TICKET BOOKING APPLICATION ********");
    	System.out.println("1.SignIn\n2.Visitor\n");
    	userChoice = Validation.isIntOnly();
		switch (userChoice) {
			case 1:login.signIn();
				   break;
			case 2:Visitor.explore(userChoice);
				   break;
			default:System.out.println("Enter a valid choice ");
				    break;
	    }
    }
}