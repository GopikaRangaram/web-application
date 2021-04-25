//class Cancellation for cancelling booked tickets
class Cancellation {
	//method for cancelling the tickets
	public static void cancelTickets(String ticket, int ticketFare) {
		String[] seatLocation = ticket.split(" ");
		int seatNumber[] = new int[seatLocation.length];
		int rowLocation = 0, iterator;
		for (iterator = 0; iterator < seatLocation.length; iterator++) {
			System.out.println(seatLocation[iterator]);
			seatNumber[iterator] = Character.getNumericValue(seatLocation[iterator].charAt(seatLocation[iterator].length()-1));	
		}
		System.out.println("Enter the seat to be cancelled");
		String seatChoice = Validation.isStringOnly();
		int columnLocation = Character.getNumericValue(seatChoice.charAt(seatChoice.length() - 1));
		int checkColumnLocation = 0;
		for (iterator = 0; iterator < seatNumber.length; iterator++) {
			if (seatNumber[iterator] == columnLocation) {
				checkColumnLocation = 1;
				String Category = "";
				for (iterator = 0; iterator < seatChoice.length() - 1; iterator++) {
					Category += seatChoice.charAt(iterator);
				}
				if (Category.equals("Gold")) {
					rowLocation = 0;
					Tickets.isFreezedColumnsGold++;
					System.out.println(Tickets.isFreezedColumnsGold);
					Tickets.remainingSeatsGold--;
				}
				if (Category.equals("Medium")) {
					rowLocation = 1;
					Tickets.isFreezedColumnsMedium++;
					System.out.println(Tickets.isFreezedColumnsMedium);
					Tickets.remainingSeatsMedium--;
				}
				if (Category.equals("Base")) {
					rowLocation = 2;
					Tickets.isFreezedColumnsBase++;
					System.out.println(Tickets.isFreezedColumnsBase);
					Tickets.remainingSeatsBase--;
				}
				Tickets.seats[rowLocation][columnLocation - 1] = '-';
				Validation.seatChanges(Tickets.seats);
				Tickets tickets = new Tickets();
				tickets.replaceInFile(Tickets.seats,Visitor.TicketHistory[0],Visitor.TicketHistory[1],Visitor.TicketHistory[2]);
				confirmCancellation(ticketFare);
			}
		}
		if (checkColumnLocation==0) {
			System.out.println("Enter the correct seats to cancel");
			cancelTickets(ticket, ticketFare);
		}
	}
	
	//method for refunding the amount
	public static void confirmCancellation(int ticketFare) {
		System.out.println("Rs." + ticketFare + " will be refunded to your account");
	}
}