package employeedetails;
import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
public class EmployeeDobConversion {
    // method to convert the Date of Birth into age
    public static int conversion() {
        while (true) {
            try {
                String DateOfBirth = Employee.getOnlyString();
                String[] ageArray = DateOfBirth.split("-", 3);
                int year = Integer.valueOf(ageArray[0]);
                int month = Integer.valueOf(ageArray[1]);
                int date = Integer.valueOf(ageArray[2]);
                LocalDate localDate = LocalDate.of(year, month, date);
                LocalDate now1 = LocalDate.now();
                Period difference = Period.between(localDate, now1);
                int resultAge = difference.getYears();
                return resultAge;
            } catch (InputMismatchException inputMismatchError) {
                System.out.println("enter valid date of birth");
                continue;
            }
        }
    }
}