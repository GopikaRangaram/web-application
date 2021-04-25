//importing necessary classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//class Visitor for carrying out visitor functionalities like selecting city,movie and theatre
//Visitor class is the parent class of class RegisteredUser
class Visitor {
	static int isVisitor;
	static String TicketHistory[] = new String[6];
	
	//method for exploring
	public static void explore(int alreadyPresent) {
		isVisitor = alreadyPresent;
		//invoking method to select City
		selectCity();
	}
	
	//method for selecting City
	public static void selectCity() {
		String record = "";
		List<String> city = new ArrayList<String>();
		List<String> movie = new ArrayList<String>();
		int isCityFound = 0;
		String cityOption = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
			//displaying available cities
			System.out.println("Cities available: ");
			System.out.println("");
			while ((record = bufferedReader.readLine()) != null) {
				String detailsArray[] = record.split(",");
				city.add(detailsArray[0]);
			}
			bufferedReader.close();
			bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
			HashSet<String> citySet = new HashSet<String>(city);
			List<String> cityUnique = new ArrayList<String>(citySet);
			for (Object object: cityUnique)
				System.out.println(object);
			System.out.println("-----------------------------------");
			System.out.println("City: ");
			cityOption = Validation.isStringOnly();
			while ((record = bufferedReader.readLine()) != null) {
				String detailArray[] = record.split(",");
				if (detailArray[0].equalsIgnoreCase(cityOption)) {
					TicketHistory[0] = detailArray[0];
					isCityFound = 1;
					movie.add(detailArray[1]);
				}
			}
			HashSet<String> moviesSet = new HashSet<String>(movie);
			List<String> movieUnique = new ArrayList<String>(moviesSet);
			for (Object object: movieUnique)
				System.out.println("Movie(s) available in this city: " + object);
			System.out.println("-----------------------------------");
			//invoking method to select Movie
			if (isCityFound == 1)
				selectMovie(cityOption);
			else {
				System.out.println("The chosen city is unavailable\n");
				selectCity();
			}
			bufferedReader.close();
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
	}
	
	//method for selecting Movie
	public static void selectMovie(String city) {
		String record = "";
		System.out.println("Movie: ");
		String movieOption = Validation.isStringOnly();
		int isMovieFound = 0;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
			while ((record = bufferedReader.readLine()) != null) {
				String detailsArray[] = record.split(",");
				if (detailsArray[0].equalsIgnoreCase(city) && detailsArray[1].equalsIgnoreCase(movieOption)) {
					isMovieFound = 1;
					TicketHistory[1] = detailsArray[1];
					System.out.println(movieOption+" is available in theatre(s): " + detailsArray[2]);
				}
			}
			System.out.println("-----------------------------------");
			if (isMovieFound == 1)
				selectTheatre(city,movieOption);
			else {
				System.out.println("The chosen movie is unavailable in " + city);
				selectMovie(city);
			}
			bufferedReader.close();
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
	}
	
	//method for selecting Theatre
	public static void selectTheatre(String city, String movie)  {
		String record = "", theatreOption = "";
		System.out.println("Theatre: ");
		theatreOption = Validation.isStringOnly();
		int isTheatreFound = 0;
		try {
			String newArray = "";
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
			while ((record = bufferedReader.readLine()) != null) {
				String detailsArray[] = record.split(",");
				if (detailsArray[0].equalsIgnoreCase(city) && detailsArray[1].equalsIgnoreCase(movie) && detailsArray[2].equalsIgnoreCase(theatreOption)) {
					isTheatreFound = 1;
					TicketHistory[2] = detailsArray[2];
					System.out.println("Theatres: " + detailsArray[2]);
					System.out.println("-----------------------------------");
					newArray = detailsArray[3];
					int position = 0;
					char[][] emptySeat = new char[3][3];
					for (int iterator = 0; iterator < 3; iterator++)
						for (int innerIterator = 0; innerIterator < 3; innerIterator++)
							emptySeat[iterator][innerIterator]=newArray.charAt(position++);
					System.out.println("Date: ");
					String date = Validation.isDateOnly();
					TicketHistory[5] = date;
					if (isVisitor == 2) {
						bookTickets();
						Tickets.getSeats(emptySeat);
					}
					else
						Tickets.getSeats(emptySeat);
				}
			}
			if (isTheatreFound == 0) {
				System.out.println("Select a valid theatre..");
				selectTheatre(city,movie);
			}
			bufferedReader.close();
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
	}
	
	//method for registration
	private static void bookTickets(){
		Login login = new Login();
		System.out.println("Get registered to Book Tickets");
		login.signUp();
	}
}