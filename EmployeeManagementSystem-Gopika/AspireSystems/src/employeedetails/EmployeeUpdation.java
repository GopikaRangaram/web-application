package employeedetails;
public class EmployeeUpdation extends Employee {
    public void getOptionsForUpdation() {
        System.out.println("Enter the employee Id whose details to be updated");
        String employeeID = Employee.getOnlyString();
        //index is the position of that employee
        int index = 0;
        for (int iteration = 0; iteration < noOfEmployee; iteration++) {
            if (employeeArray[iteration].id.equals(employeeID))
                index = iteration;

        }
        System.out.println("Select which data to be updated");
        System.out.println("1.To change Name\n2.To change Age\n3.To change EmailId\n4.To change MobileNumber");
        int choice = Employee.getOnlyInteger();
        switch (choice) {
            case 1:
                changeName(index);
                break;
            case 2:
                changeAge(index);
                break;
            case 3:
                changeEmailId(index);
                break;
            case 4:
                changeMobileNumber(index);
                break;
        }

    }
    //To update the Mobile Number
    private void changeMobileNumber(int employeeIndexPosition) {
        System.out.println("Enter the new mobile number");
        long newMobileNumber = Employee.getOnlyLong();
        if (EmployeeValidation.isMobileNumber(newMobileNumber))
            employeeArray[employeeIndexPosition].mobileNo = newMobileNumber;
        else {
            System.out.println("oops error!!!! Try again correctly");
            changeMobileNumber(employeeIndexPosition);
        }
    }
    //To update the Email Id
    private void changeEmailId(int employeeIndexPosition) {
        System.out.println("Enter the new email ID");
        String newEmailId = Employee.getOnlyString();
        if (EmployeeValidation.isEmailid(newEmailId))
            employeeArray[employeeIndexPosition].emailId = newEmailId;
        else {
            System.out.println("oops error!!!! Try again correctly");
            changeEmailId(employeeIndexPosition);
        }
    }
    //To update the Age
    private void changeAge(int employeeIndexPosition) {
        System.out.println("Enter the date of birth");
        int newAge = EmployeeDobConversion.conversion();
        if (EmployeeValidation.isValidAge(newAge))
            employeeArray[employeeIndexPosition].age = newAge;
        else {
            changeAge(employeeIndexPosition);
        }
    }
    //To update the Name
    private void changeName(int employeeIndexPosition) {
        System.out.println("Enter the new name");
        String newName = Employee.getOnlyString();
        if (EmployeeValidation.isStringOnlyAlphabet(newName)) {
            employeeArray[employeeIndexPosition].name = newName;
        } else {
            System.out.println("oops error!!!! Try again correctly.....Only alphabets are permitted");
            changeName(employeeIndexPosition);
        }
    }
}