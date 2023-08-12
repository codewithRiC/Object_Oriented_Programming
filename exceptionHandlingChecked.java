import java.util.Scanner;
import java.io.IOException;
import java.sql.SQLException;

public class exceptionHandlingChecked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. for checked eception IO Exception");
        System.out.println("2. for checked exception for SQL Exception");
        System.out.println("3. for class not found Exception");
        System.out.println("4 for exit\n");
        int choice; // Change the value to test different exceptions
        while (true) {

            try {
                System.out.println("enter the evalue\n ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        throw new IOException(); // Checked Exception

                    case 2:
                        throw new SQLException(); // Checked Exception
                    case 3:
                        Class.forName("Class1"); // Class1 is not defined
                        break;

                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }

            } catch (IOException e) {
                System.out.println("IOException: Error reading file.");
            } catch (SQLException e) {
                System.out.println("SQLException: Database error.");
            } catch (ClassNotFoundException e) {
                System.out.println(e);
                System.out.println("Class Not Found...");
            }
           // sc.close();
   }
 }
}
