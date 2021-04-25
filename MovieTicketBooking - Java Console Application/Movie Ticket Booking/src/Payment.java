//class Payment for making payment
class Payment {
	//method for making payment
	public static boolean makePay(int ticketFare, int totalSeats) {
		int totalFare = ticketFare * totalSeats;
		String fare = Integer.toString(totalFare);
		Visitor.TicketHistory[4] = fare;
		System.out.println("Pay Rs. " + totalFare + "\nEnter your account Balance");
		int accountBalance = Validation.isIntOnly();
		if (accountBalance >= totalFare) {
			accountBalance -= totalFare;
			System.out.println("Rs." + totalFare + " is debited\nYour remaining balance is Rs." + accountBalance);
			return true;
		} 
		else
			return false;
	}
}