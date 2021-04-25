import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//class Login for both registration and login
class Login {
	String userName = "", password = "", emailId = "", mobileNum = "";
	long mobileNumber;
	
	//method for registration
	public void signUp() {
		System.out.println("------Welcome to registration------");
		//getting User Name
		System.out.print("User Name: ");
		while (true) {
			userName = Validation.isStringOnly();
			if (Validation.isStringOnlyAlphabet(userName))
				break;
			else {
				System.out.println("Please enter valid username...");
				continue;
			}
		}
		//getting User EmailId
		System.out.print("User EmailId: ");
		while (true) {
			emailId = Validation.isStringOnly();
			if (Validation.isEmailid(emailId))
				break;
			else {
				System.out.println("Please enter valid emailid...");
				continue;
			}
		}
		//getting User Password
		System.out.print("User Password: ");
		while (true) {
			password = Validation.isStringOnly();
			if (Validation.isPassword(password))
				break;
			else {
				System.out.println("Please enter 6 to 10 characters...");
				continue;
			}
		}
		//getting User mobile number
		System.out.print("User Mobile Number: ");
		while (true) {
			mobileNumber = Validation.isLongOnly();
			if (Validation.isMobileNumber(mobileNumber))
				break;
			else {
				System.out.println("Please enter valid mobile number");
				continue;
			}
		}
		mobileNum = Long.toString(mobileNumber);
		//storing user details
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","angu");
			Statement statement = connection.createStatement();
			String query = "INSERT INTO Users VALUES('"+userName+"','"+emailId+"','"+password+"','"+mobileNum+"')";
			statement.executeUpdate(query);
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
		System.out.println("Registration is successful");
		if (MovieTicketBooking.userChoice!=2)
			signIn();
	}
	
	//method for logging in.
	public void signIn()  {
		int isRegistered = 0;
		try {
			System.out.println("--------------SignIn---------------");
			System.out.print("User EmailId: ");
			emailId = Validation.isStringOnly();
			System.out.print("User Password: ");
			password = Validation.isStringOnly();
			//redirects to admin page if the emailId and password matches
			if (emailId.equals("admin@gmail.com")) {
				if (password.equals("admin123")) {
					Admin admin = new Admin();
					try {
						admin.startProcess();
					}
					catch (Exception exception) {
						System.out.print("The exception is " + exception);
					}
				}
			else
				signIn();
			}
			//redirects to the home page
			else {
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","angu");
					Statement statement = connection.createStatement();
					ResultSet results = statement.executeQuery("SELECT Email,Password FROM Users");
					while(results.next()) {
						if (results.getString(1).equals(emailId) && results.getString(2).equals(password)) {
							System.out.println("Logged in successfully!!");
							System.out.println("-----------------------------------");
							isRegistered = 1;
							RegisteredUser.startExploring();
						}
					}
					if (isRegistered == 0) {
						System.out.println("Sorry!!! You are not registered in this application");
						signUp();
					}
				}
				catch (Exception exception) {
					System.out.print("The exception is " + exception);
				}
			}
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
	}
}