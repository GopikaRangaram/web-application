package employeedetails;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//This class is used to validate the employee details
public class EmployeeValidation extends Employee {
    //to search the employee by matching with their emailId
    public void search(String referenceMail) {
        int hasAlreadyPresent = 0;
        for (int iteration = 0; iteration < noOfEmployee; iteration++) {
            if (employeeArray[iteration].emailId.equals(referenceMail)) {
                hasAlreadyPresent++;
                System.out.println("employee name --> " + employeeArray[iteration].name + "\nemployee id --> " + employeeArray[iteration].id + "\nempoyee age -->  " + employeeArray[iteration].age + "\nemployee mail id -->  " + employeeArray[iteration].emailId + "\nemployee Ph.no -->  " + employeeArray[iteration].mobileNo);
                break;
            }
        }
        if (hasAlreadyPresent == 0)
            System.out.println("No such employee is found");
    }
    // to display the employee details
    public void display() {
        for (int iteration = 0; iteration < noOfEmployee; iteration++) {
            System.out.println("                                                ");
            System.out.println("employee name --> " + employeeArray[iteration].name + "\nemployee id --> " + employeeArray[iteration].id + "\nempoyee age -->  " + employeeArray[iteration].age + "\nemployee mail id -->  " + employeeArray[iteration].emailId + "\nemployee Ph.no -->  " + employeeArray[iteration].mobileNo);
        }
    }
    // to validate the mobile number
    public static boolean isMobileNumber(long mobileNo) {
        String phoneNumber = String.valueOf(mobileNo);
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return (matcher.find() && matcher.group().equals(phoneNumber));
    }
    //to validate the email id
    public static boolean isEmailid(String emailId) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (emailId == null)
            return false;
        return pattern.matcher(emailId).matches();
    }
    //to validate the name
    public static boolean isStringOnlyAlphabet(String name) {
        return ((!name.equals(" ")) && (name != null) && (name.matches("^[a-zA-Z]*$")));
    }
    //to validate age
    public static boolean isValidAge(int correctAge) {
        try {
            if (correctAge >= 18 && correctAge <= 58)
                return true;
            else if (correctAge < 18) {
                System.out.println("you are under age. Please enter correct valid age!!!");
                return false;
            } else {
                System.out.println("you are aged. Please enter correct valid age!!!");
                return false;
            }
        } catch (Exception error) {
            System.out.println("Only numeric values are accepted!!!");
            return false;
        }
    }
    //to find the duplicate elements
    public boolean isIdAlreadyExist(String element) {
        for (int iteration = 0; iteration < noOfEmployee; iteration++) {
            if (employeeArray[iteration].id.equals(element)) {
                return true;
            }
        }

        return false;
    }
    public boolean isEmailIdAlreadyExist(String element) {
        for (int iteration = 0; iteration < noOfEmployee; iteration++) {
            if (employeeArray[iteration].emailId.equals(element)) {
                System.out.println("The emailId is already in use...Try using another account");
                return true;
            }
        }
        return false;
    }
}