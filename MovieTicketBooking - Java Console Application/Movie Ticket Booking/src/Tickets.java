//class Tickets for booking tickets
class Tickets {
	static int seatRows = 3; 
	static int seatColumns = 3; 
	static int remainingSeatsBase =  0;
	static int remainingSeatsGold = 0;
	static int remainingSeatsMedium = 0;
	static int isFreezedColumnsBase = seatColumns;
	static int isFreezedColumnsMedium = seatColumns;
	static int isFreezedColumnsGold = seatColumns;
	static char[][] seats = new char[seatRows][seatColumns];
	
	//method for getting seats from theatre
	public static void getSeats(char[][] emptySeat) {
		for (int iterator=0; iterator < seatRows; iterator++) {
			for (int innerIterator = 0; innerIterator < seatColumns; innerIterator++)
				seats[iterator][innerIterator]=emptySeat[iterator][innerIterator];
		}
		try	{
			selectSeats();
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
	}
	
	//method for selecting seats
	public static void selectSeats() {
		Tickets tickets = new Tickets();
		int highCost = 220, freezeSeat = 0, ticketFare = 0;
		Visitor.TicketHistory[3] = "";
		String decision = "yes", Category = "";
		System.out.println("Book seats\n");
		String[] args = null;
		//freezing seats
		Validation.seatChanges(seats);
		System.out.println("Select seatCategory: \nGold = Rs.220\nMedium = Rs.200\nBase = Rs.180");
		while (decision.equals("yes")) {
			Category = Validation.isStringOnly();
			if (Category.equals("Gold") || Category.equals("Medium") || Category.equals("Base"))
				break;
			else {
				decision = "yes";
				System.out.println("Enter the valid seat category");
			}
		}
		System.out.println("Select number of seats to book");
		int numberOfSeats = Validation.isIntOnly();
		if (Category.equals("Base")) {
			freezeSeat = 2;
			remainingSeatsBase = 0;
			ticketFare = 180;
			if (isFreezedColumnsBase >= numberOfSeats) {
				isFreezedColumnsBase -= numberOfSeats;				
				//invoking makePay() method from Payment class
				if (Payment.makePay(ticketFare, numberOfSeats)) {
					for (int selectrow = 0; selectrow < seatColumns; selectrow++) {
						if (seats[freezeSeat][selectrow] != '*'  && numberOfSeats > 0) {
							seats[freezeSeat][selectrow] = '*';
							remainingSeatsBase++;
							numberOfSeats--;
							Visitor.TicketHistory[3] += Category + (selectrow+1) + " ";
						}
					}
					
					System.out.println("-----Your booking is confirmed-----");
					System.out.println("------------Thank you!!------------");
					System.out.println("\n-----------Ticket History----------");
					System.out.println("City: " + Visitor.TicketHistory[0]);
					System.out.println("Movie: " + Visitor.TicketHistory[1]);
					System.out.println("Theatre: " + Visitor.TicketHistory[2]);
					System.out.println("Seat Number: " + Visitor.TicketHistory[3]);
					System.out.println("TotalPayment: " + Visitor.TicketHistory[4]);
					System.out.println("Movie Date: " + Visitor.TicketHistory[5]);
					System.out.println("-----------------------------------");
					tickets.replaceInFile(seats,Visitor.TicketHistory[0],Visitor.TicketHistory[1],Visitor.TicketHistory[2]);
					System.out.println("Do you want to cancel tickets?\nEnter yes/no");
					String cancelDecision = "";
					while (true) {
						cancelDecision = Validation.isStringOnly();
						if (cancelDecision.equals("yes") || cancelDecision.equals("no"))
							break;
						else
							System.out.println("Enter yes/no ");
					}
					if (cancelDecision.equals("yes")) {  
						//invoking cancelTickets() method from Cancellation class
						Cancellation.cancelTickets(Visitor.TicketHistory[3], ticketFare);
					}
					MovieTicketBooking.main(args);
				}
				else {
					System.out.println("Insufficient Balance");
					MovieTicketBooking.main(args);
				}
				
			}
			else {
				System.out.println("Seats Available: " + (isFreezedColumnsBase));
				selectSeats();
			}
		}
		if (Category.equals("Medium")) {
			freezeSeat = 1;
			remainingSeatsMedium = 0;
			ticketFare = 200;
			if (isFreezedColumnsMedium >= numberOfSeats) {
				isFreezedColumnsMedium -= numberOfSeats;
				//invoking makePay() method from Payment class
				if (Payment.makePay(ticketFare, numberOfSeats)) {
					for (int selectrow = 0; selectrow < seatColumns; selectrow++) {
						if (seats[freezeSeat][selectrow] != '*' && numberOfSeats > 0) {
							seats[freezeSeat][selectrow] = '*';
							remainingSeatsMedium++;
							numberOfSeats--;
							Visitor.TicketHistory[3] += Category + (selectrow+1) + " ";
						}
					}
					System.out.println("-----Your booking is confirmed-----");
					System.out.println("------------Thank you!!------------");
					System.out.println("\n-----------Ticket History----------");
					System.out.println("City: " + Visitor.TicketHistory[0]);
					System.out.println("Movie: " + Visitor.TicketHistory[1]);
					System.out.println("Theatre: " + Visitor.TicketHistory[2]);
					System.out.println("Seat Number: " + Visitor.TicketHistory[3]);
					System.out.println("TotalPayment: " + Visitor.TicketHistory[4]);
					System.out.println("Movie Date: " + Visitor.TicketHistory[5]);
					System.out.println("-----------------------------------");
					tickets.replaceInFile(seats,Visitor.TicketHistory[0],Visitor.TicketHistory[1],Visitor.TicketHistory[2]);
					System.out.println("Do you want to cancel tickets?\nEnter yes/no");
					String cancelDecision = "";
					while (true) {
						cancelDecision = Validation.isStringOnly();
						if (cancelDecision.equals("yes") || cancelDecision.equals("no"))
							break;
						else
							System.out.println("Enter yes/no ");
					}
					if (cancelDecision.equals("yes")) {  
						//invoking cancelTickets() method from Cancellation class
						Cancellation.cancelTickets(Visitor.TicketHistory[3], ticketFare);
					}
					MovieTicketBooking.main(args);
				}
				else {
					System.out.println("Insufficient Balance");
					MovieTicketBooking.main(args);
				}	
			}
			else {
				System.out.println("Seats Available: " + (isFreezedColumnsMedium));
				selectSeats();
			}
		}
		if (Category.equals("Gold")) {
			freezeSeat = 0;
			remainingSeatsGold = 0;
			ticketFare = 220;
			if (isFreezedColumnsGold >= numberOfSeats) { 
				isFreezedColumnsGold -= numberOfSeats;
				//invoking makePay() method from Payment class
				if (Payment.makePay(ticketFare, numberOfSeats)) {
					for (int selectrow = 0; selectrow < seatColumns; selectrow++) {
						if (seats[freezeSeat][selectrow] != '*' && numberOfSeats > 0) {
							seats[freezeSeat][selectrow] = '*';
							remainingSeatsGold++;
							numberOfSeats--;
							Visitor.TicketHistory[3] += Category +(selectrow+1) + " ";
						}
					}
					System.out.println("-----Your booking is confirmed-----");
					System.out.println("------------Thank you!!------------");
					System.out.println("\n-----------Ticket History----------");
					System.out.println("City: " + Visitor.TicketHistory[0]);
					System.out.println("Movie: " + Visitor.TicketHistory[1]);
					System.out.println("Theatre: " + Visitor.TicketHistory[2]);
					System.out.println("Seat Number: " + Visitor.TicketHistory[3]);
					System.out.println("TotalPayment: " + Visitor.TicketHistory[4]);
					System.out.println("Movie Date: " + Visitor.TicketHistory[5]);
					System.out.println("-----------------------------------");
					tickets.replaceInFile(seats,Visitor.TicketHistory[0],Visitor.TicketHistory[1],Visitor.TicketHistory[2]);
					highCost = 220;
					for (int seatAvail = 0; seatAvail < seatRows; seatAvail++) {
						for (int seatCategory = 0; seatCategory < seatColumns; seatCategory++)
							System.out.print(seats[seatAvail][seatCategory] + " ");
						System.out.println(" Rs." + highCost);
						highCost -= 20;
						System.out.println();
					}
					System.out.println("Do you want to cancel tickets?\nPress yes/no");
					String cancelDecision = "";
					while (true) {
						cancelDecision = Validation.isStringOnly();
						if (cancelDecision.equals("yes") || cancelDecision.equals("no"))
							break;
						else
							System.out.println("Enter yes/no ");
					}
					if (cancelDecision.equals("yes")) {  
						//invoking cancelTickets() method from Cancellation class
						Cancellation.cancelTickets(Visitor.TicketHistory[3], ticketFare);
					}
					MovieTicketBooking.main(args);
				}
				else {
					System.out.println("Insufficient Balance");
					MovieTicketBooking.main(args);
				}
			}
			else {
				System.out.println("Seats Available: " + (isFreezedColumnsGold));
				selectSeats();
			}
		}	
	}
	
	//method for updating seat in files
	public void replaceInFile(char seats[][],String city,String movie,String theatre) {
		String updatedSeat = "";
		for (int iterator = 0;iterator < seatRows;iterator++) {
			for (int innerIterator = 0;innerIterator < seatColumns;innerIterator++)
				updatedSeat += seats[iterator][innerIterator];
		}
		Admin.updateTheatreSeats(city,movie,theatre,updatedSeat);
	}
}
