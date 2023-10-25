/* OOPROG ACTIVITY
NAME: RUBI, LARIE JANE  BSIT 2B*/
import java.util.Scanner;

public class Student {
    String firstName;
    String middleName;
    String lastName;
    String suffix;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.printf("First Name: ");
        student.setFirstName(scanner.nextLine());

        System.out.printf("Middle Name: ");
        student.setMiddleName(scanner.nextLine());

        System.out.printf("Last Name: ");
        student.setLastName(scanner.nextLine());

        System.out.printf("Suffix: ");
        student.setSuffix(scanner.nextLine());

        System.out.println("Your Full Name: " + student.getFirstName() + " " +student.getMiddleName() + " " +student.getLastName() + " " +student.getSuffix());
    }
}