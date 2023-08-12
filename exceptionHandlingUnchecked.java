import java.util.Scanner;


public class exceptionHandlingUnchecked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. for Airthmetic Exception ");
        System.out.println("2. for Null Pointer Exception");
        System.out.println("3 for Array index outof bound exception");
       System.out.println("4 for string of bound ");
        System.out.println("5 for exit\n");
        int choice; // Change the value to test different exceptions
        while (true) {

            try {
                System.out.println("enter the evalue\n ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        int a = 10, b = 0;
                        int c = a / b; // ArithmeticException
                        break;

                    case 2:
                        String str = null;
                        str.length(); // NullPointerException
                        break;

                    case 3:
                        int[] arr = { 1, 2, 3 };
                        int element = arr[3]; // ArrayIndexOutOfBoundsException
                        break;
                    case 4:
                    String z = "This is like chipping "; // length is 22
                    char d = z.charAt(24); // accessing 25th element
                    System.out.println(d);
                    break;
                    
                    case 5:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }

            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Cannot divide by zero.");
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: Object is null.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Index out of range.");
               }   catch(StringIndexOutOfBoundsException e) {
                    System.out.println("StringIndexOutOfBoundsException");
                }
          // sc.close(); 
     }
  }

}