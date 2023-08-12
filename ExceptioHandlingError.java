import java.util.Scanner;

public class ExceptioHandlingError {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter choice (1-3): ");
        System.out.println(" 1 for stack overflow Error");
        System.out.println("2. for out of memory Error ");
        System.out.println("3. for Exit");
        
        while (true){
            try{
                int choice = input.nextInt();
        switch (choice) {
            case 1:
                
                recursiveFunction();
                break;
           
            case 2:
                
                 int[] arr = new int[Integer.MAX_VALUE];
                break;
            case 3:
            System.exit(0);
            break;
            default:
                System.out.println("Unknown choice");
                break;
        
            }
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }  catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }
        // input.close();
        }
    }  
    public static void recursiveFunction() {
        recursiveFunction();
  }
}  