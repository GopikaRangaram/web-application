//importing necessary classes
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//class Admin implements the interfaces City, Movie and Theatre
//Admin class overrides all the methods present in the interfaces City, Movie and Theatre
class Admin implements City, Movie, Theatre {
	static int seatAvailability = 1;
	
	public void startProcess() throws FileNotFoundException, IOException {
		overrideMovie();
	}
	
	void overrideMovie() throws FileNotFoundException, IOException {
		System.out.println("1.Add details\n2.Update details\n3.Remove details\n");
		int adminChoice = Validation.isIntOnly();
		switch (adminChoice) {
			case 1:System.out.println("Addition of movie Details");
				   addCity();
				   break;
			case 2:System.out.println("Updation of movie Details");
				   updateMovieDetails();
				   break;
			case 3:System.out.println("Deletion of movie Details");
				   removeMovieDetails();
					break;
			default:System.out.println("Enter a valid choice\n");
					break;
		}
	}
	
	 //method for adding theatre
	public void addTheatre() {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\CityDetails.txt", true));
			String theatreName = "";
			System.out.println("Theatre: ");
			theatreName = Validation.isStringOnly();
			bufferedWriter.append(theatreName);
			bufferedWriter.append(",");
			bufferedWriter.append("---------");
			bufferedWriter.newLine();
			bufferedWriter.close();
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
	  }
	}

	//method for adding movie
	public void addMovieDetails() {
		try {
			String movieName = "";
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\CityDetails.txt", true));
			System.out.println("Movie: ");
			movieName = Validation.isStringOnly();
			bufferedWriter.append(movieName);
			bufferedWriter.append(",");
			bufferedWriter.close();
			addTheatre();
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
	}

	//method for adding City
	public void addCity() {
		String cityName = "", adminDecision = "yes";
		try {
			while (adminDecision.equals("yes")) {
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\CityDetails.txt", true));
				System.out.println("City: ");
				cityName = Validation.isStringOnly();
				bufferedWriter.append(cityName);
				bufferedWriter.append(",");
				bufferedWriter.close();
				addMovieDetails();
				System.out.println("Do you want to continue?\nEnter yes/no");	
				while (true) {
					adminDecision = Validation.isStringOnly();
					if (adminDecision.equals("yes") || adminDecision.equals("no"))
						break;
					else
						System.out.println("Enter yes/no");
				}
			}
		}
		catch (Exception exception) {
			System.out.print("The exception is " + exception);
		}
	}
	
	//method for updating movie details
	public void updateMovieDetails() throws FileNotFoundException, IOException {
		String filePath = "C:\\Users\\HP\\Desktop\\CityDetails.txt", fileContent = "", record = "", cityUpdate = "", oldMovie = "", newMovie = "", theatreUpdate = "", recordUpdate = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\TemporaryFile.txt"));
		fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
		System.out.println("City: ");
		cityUpdate = Validation.isStringOnly();
		if (fileContent.toLowerCase().contains(cityUpdate.toLowerCase())) {
			System.out.println("Old Movie: ");
			oldMovie = Validation.isStringOnly();
			if (fileContent.toLowerCase().contains(oldMovie.toLowerCase())) {
				System.out.println("Theatre: ");
				theatreUpdate = Validation.isStringOnly();
				if (fileContent.toLowerCase().contains(theatreUpdate.toLowerCase())) {
					try {
						System.out.println("New Movie: ");
						newMovie = Validation.isStringOnly();
						while ((record = bufferedReader.readLine())!=null) {
							String attribute[] = record.split(",");
							if (attribute[0].equalsIgnoreCase(cityUpdate)) {
								if ((attribute[1].equalsIgnoreCase(oldMovie)) && (attribute[2].equalsIgnoreCase(theatreUpdate))) {
									bufferedWriter.append(attribute[0]);
									bufferedWriter.append(",");
									bufferedWriter.append(newMovie);
									bufferedWriter.append(",");
									bufferedWriter.append(attribute[2]);
									bufferedWriter.append(",");
									bufferedWriter.append(attribute[3]);
									bufferedWriter.newLine();
								}
								else {
									bufferedWriter.append(record);
									bufferedWriter.newLine();
								}
							}
							else {
								bufferedWriter.append(record);
								bufferedWriter.newLine();
							}
						}
						bufferedReader.close();
						bufferedWriter.close();
						bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
						bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\TemporaryFile.txt"));
						while ((recordUpdate = bufferedReader.readLine())!= null) {
							bufferedWriter.append(recordUpdate);
							bufferedWriter.newLine();
						}
						bufferedReader.close();
						bufferedWriter.close();
					}
					catch (Exception exception) {
						System.out.print("The exception is " + exception);
					}
				}
				else
					System.out.println("The theatre entered is not in database!!");
			}
			else
				System.out.println("The movie entered is not in database!!");
		}
		else
			System.out.println("The chosen city is unavailable!!");
	}
	
	//method for removing movie details
	public void removeMovieDetails() throws FileNotFoundException, IOException {
		String cityName = "", movieName = "", theatreName = "", fileContent = "", filePath = "C:\\Users\\HP\\Desktop\\CityDetails.txt", record = "";
		System.out.println("City: ");
		cityName = Validation.isStringOnly();
		fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
		if (fileContent.toLowerCase().contains(cityName.toLowerCase())) {
			System.out.println("Movie: ");
			movieName = Validation.isStringOnly();
			if (fileContent.toLowerCase().contains(movieName.toLowerCase())) {
				System.out.println("Theatre: ");
				theatreName = Validation.isStringOnly();
				if (fileContent.toLowerCase().contains(theatreName.toLowerCase())) {
					BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
					BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\TemporaryFile.txt"));
					while ((record = bufferedReader.readLine())!= null) {
						String attribute[] = record.split(",");
						if (!(attribute[0].equalsIgnoreCase(cityName)) || !(attribute[1].equalsIgnoreCase(movieName)) || !(attribute[2].equalsIgnoreCase(theatreName))) {
							bufferedWriter.append(record);
							bufferedWriter.newLine();
						}
					}
					bufferedReader.close();
					bufferedWriter.close();
					String recordUpdate = "";
					bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
					bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\TemporaryFile.txt"));
					while ((recordUpdate = bufferedReader.readLine())!= null) {
						bufferedWriter.append(recordUpdate);
						bufferedWriter.newLine();
					}
					bufferedReader.close();
					bufferedWriter.close();
				}
				else
					System.out.println("The theatre entered  is not available!!");
			}
			else
				System.out.println("The movie entered is not available in the chosen city!!");
		}
		else
			System.out.println("The city entered is not in database!!");
	}
	
	//method for updating booked seat details
	public static void updateTheatreSeats(String cityUpdate,String newMovie,String theatre,String updatedSeats) {
		try {
			String record = "";
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\TemporaryFile.txt"));
			while ((record = bufferedReader.readLine())!=null) {
				String attribute[] = record.split(",");
				if (attribute[2].equals(theatre)) {
					bufferedWriter.append(cityUpdate);
					bufferedWriter.append(",");
					bufferedWriter.append(newMovie);
					bufferedWriter.append(",");
					bufferedWriter.append(theatre);
					bufferedWriter.append(",");
					bufferedWriter.append(updatedSeats);
					bufferedWriter.newLine();
				}
				else {
					bufferedWriter.append(record);
					bufferedWriter.newLine();
				}
			}
			bufferedReader.close();
			bufferedWriter.close();
			String recordUpdate = "";
			bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\CityDetails.txt"));
			bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\TemporaryFile.txt"));
			while ((recordUpdate = bufferedReader.readLine())!= null) {
				bufferedWriter.append(recordUpdate);
				bufferedWriter.newLine();
			}
			bufferedReader.close();
			bufferedWriter.close();
		}
		catch (Exception exception) {
			System.out.println("The exception is " + exception);
		}
	}
}