/*class RegisteredUser inherits class Visitor. 
RegisteredUser can book tickets, make payment and cancel tickets.*/
class RegisteredUser extends Visitor {
	//calling startExploring() method from Visitor class
	public static void startExploring()  {
		Visitor.explore(1);
		Tickets.selectSeats();
	}
}