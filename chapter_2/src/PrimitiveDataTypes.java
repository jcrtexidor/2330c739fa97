import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Declaring data variables
        int age = 15;
        double gpa = 3.45;
        char firstInitial = 'J';
        char lastInitial = 'C';
        boolean hasPerfectAttendance = true;
        String firstName = "José Carlos";
        String lastName = "Rodríguez Texidor";

        // Printing primitives
        System.out.println("age: " + age);
        System.out.println("gpa: " + gpa);
        System.out.println("firstInitial: " + firstInitial);
        System.out.println("lastInitial: " + lastInitial);
        System.out.println("hasPerfectAttendance: " + hasPerfectAttendance);
        System.out.print(firstName.charAt(0) + "" + firstName.charAt(5) + ": ");
        System.out.println(firstName + " " + lastName + " has a GPA of " + gpa);

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to update it to?");
        gpa = input.nextDouble();
        System.out.println(firstName + " " + lastName + " now has a GPA of " + gpa);
    }
}
