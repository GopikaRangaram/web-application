package employeedetails;
import java.util.InputMismatchException;
import java.util.Scanner;
//Class to create field for an employee
public class Employee {
    static int noOfEmployee = 0;
    static int sizeOfArray = Employee.getOnlyInteger();
    static Node employeeArray[] = new Node[sizeOfArray];
    //Inner class is made static so the main() can access it
    static class Node {
        public String name;
        public String id;
        public String emailId;
        public long mobileNo;
        public int age;
        //Parameterized constructor----- to initialize the fields
        public Node(String name, String id, int age, String emailId, long mobileNo) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.emailId = emailId;
            this.mobileNo = mobileNo;
        }
    }
    public static long getOnlyLong() {
        try {
        	@SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            long longValue = scanner.nextLong();
            return longValue;
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Only numeric values are accepted");
            return getOnlyLong();
        }
    }
    public static int getOnlyInteger() {
        try {
        	@SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            int numericValue = scanner.nextInt();
            return numericValue;
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Only numeric values are accepted. Please select the option provided");
            return getOnlyInteger();
        }
    }
    public static String getOnlyString() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        return string;
    }
}