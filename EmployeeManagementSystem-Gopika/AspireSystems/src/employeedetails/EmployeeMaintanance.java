package employeedetails;
import java.util.InputMismatchException;
//This class is used to access the employee 
public class EmployeeMaintanance extends EmployeeValidation {
    //method to get the details of the employee
    public void getDetails(int addEmployee) {
        String name, id, emailId;
        long mobileNo;
        int age;
        while (addEmployee == 1) {
            System.out.println("Enter employee name ");
            while (true) {
                name = Employee.getOnlyString();
                //method call to validate name
                if (isStringOnlyAlphabet(name))
                    break;
                else {
                    System.out.println("Please enter the correct name");
                    continue;
                }
            }
            System.out.println("Enter employee id ");
            while (true) {
                id = Employee.getOnlyString();
                //checks for duplication
                if (isIdAlreadyExist(id)) {
                    System.out.println("The user already exist.Please enter new id");
                    continue;
                } else
                    break;
            }
            System.out.println("Enter employee Date of Birth in the format Year-Month-Date");
            while (true) {
                //method to convert DateOfBirth into age 
                age = EmployeeDobConversion.conversion();
                //checks for valid age
                if (isValidAge(age))
                    break;
                else
                    continue;
            }
            System.out.println("Enter email id ");
            while (true) {
                emailId = Employee.getOnlyString();
                //checks for duplication
                if (isEmailIdAlreadyExist(emailId)) {
                    continue;
                } else {
                    //checks for valid emailId
                    if (isEmailid(emailId)) {
                        break;
                    } else {
                        System.out.println("Please enter valid mail id");
                        continue;
                    }
                }
            }
            System.out.println("Enter mobile number ");
            while (true) {
                try {
                    mobileNo = Employee.getOnlyLong();
                    if (isMobileNumber(mobileNo))
                        break;
                    else {
                        System.out.println("Plese enter the vaild mobile number");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.err.println(e.getMessage());
                    continue;
                }
            }
            //invoking insert method
            insert(name, id, age, emailId, mobileNo);
            System.out.println("do you to enter the details of one more employee?...If yes press 1 orelse press -1");
            addEmployee = Employee.getOnlyInteger();
            if (addEmployee == 1)
                continue;
            else
                break;
        }
    }
    // to insert the employee details in an array of nodes
    public void insert(String name, String id, int age, String emailId, long mobileNo) throws ArrayIndexOutOfBoundsException {
        try {
            Node newEmployee = new Node(name, id, age, emailId, mobileNo);
            employeeArray[noOfEmployee] = newEmployee;
            noOfEmployee++;
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Stack overflow");
        }
    }
    //to delete an employee by matching with their employeeId
    public void delete(String employeeId) {
        if (noOfEmployee >= 1) {
            for (int iteration = 0; iteration < noOfEmployee; iteration++) {
                if (employeeArray[iteration].id.equals(employeeId)) {
                    employeeArray[iteration].age = 0;
                    employeeArray[iteration].mobileNo = 0;
                    employeeArray[iteration].name = employeeArray[iteration].id = employeeArray[iteration].emailId = "";
                    shift(employeeArray, iteration);
                    System.out.println("Employee terminated");
                    break;
                }
            }
        } else
            System.out.println("Stack is empty");
    }
    protected void shift(Node[] array, int emptyIndex) {
        for (int iteration = emptyIndex; iteration < noOfEmployee - 1; iteration++) {
            array[iteration] = array[iteration + 1];
        }
        noOfEmployee = noOfEmployee - 1;
    }

}