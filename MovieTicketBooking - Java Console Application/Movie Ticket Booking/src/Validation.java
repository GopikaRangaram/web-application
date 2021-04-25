import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//class Validation is used to validate the user credentials in registration
class Validation {
	//method for validating mobile number
	public static boolean isMobileNumber(long mobileNo) {
		String phoneNumber = String.valueOf(mobileNo);
		Pattern pattern = Pattern.compile("(0/91)?[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(phoneNumber);
		return (matcher.find() && matcher.group().equals(phoneNumber));
	}
	
	//method for validating email id
	public static boolean isEmailid(String emailId) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
				"[a-zA-Z0-9_+&*-]+)*@" +
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
				"A-Z]{2,7}$";
		if (emailId.matches(emailRegex) && (emailId.endsWith(".com") || emailId.endsWith(".in") || emailId.endsWith(".org")))
			return true;
		return false;
	}
	
	//method for validating password
	public static boolean isPassword(String password) {
		if (password.length() >= 6 && password.length() <= 10)
			return true;
		return false;
	}
	
	//method for validating name
	public static boolean isStringOnlyAlphabet(String name) {
		return ((!name.equals(" ")) && (name != null) && (name.matches("^[a-zA-Z]*$") && (name.length()>=1)));
	}
	
	//method for booking the seats
	public static void seatChanges(char[][] seatArray) {
		int rows = 3;
		int columns = 3;
		int highCost = 220;
		for (int seatAvail = 0; seatAvail < rows; seatAvail++) {
			for (int seatCategory = 0; seatCategory < columns; seatCategory++) 
				System.out.print(seatArray[seatAvail][seatCategory] + " ");
			System.out.println(" Rs." + highCost);
			highCost -= 20;
			System.out.println();
		}
	}
	
	//method for reading string inputs
	public static String isStringOnly() {
		try {
			Scanner scanner = new Scanner(System.in);
			String value = scanner.nextLine();
			return value;
		}
		catch (Exception exception) {
			return isStringOnly();
		}
	}
	//method for reading integer inputs
	public static int isIntOnly() {
		try {
			Scanner scanner = new Scanner(System.in);
			int value = scanner.nextInt();
			return value;
		}
		catch (Exception exception) {
			System.out.println("Enter the correct number of seats");
			return isIntOnly();
		}
	}
	
	//method for reading long inputs
	public static long isLongOnly() {
		try {
			Scanner scanner = new Scanner(System.in);
			Long value = scanner.nextLong();
			return value;
		}
		catch (Exception exception) {
			return isLongOnly();
		}
	}
	
	//method for validating date
	public static String isDateOnly() {
		try {
			System.out.println("Type in this format date-month-year(xx-yy-zzzz)");
			Scanner scanner = new Scanner(System.in);
			String value = scanner.next();
			String dateArray[] = value.split("-");
			int days = Integer.parseInt(dateArray[0]);
			int month = Integer.parseInt(dateArray[1]);
			int year = Integer.parseInt(dateArray[2]);
			if (days >= 01 && days <= 31 && month >= 01 && month <= 12 && year == 2020)
				return value;
			else {
				System.out.println("Enter valid date");
				return isDateOnly();
			}
		}
		catch (Exception exception) {
			return isDateOnly();
		}
	}
}