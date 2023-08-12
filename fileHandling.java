import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Create a file");
            System.out.println("2. Get file information");
            System.out.println("3. Write to a file");
            System.out.println("4. Read from a file");
            System.out.println("5. Delete a file");
            System.out.println("6. Exit");

            int option = scaner.nextInt();
            scaner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter file name:");
                    String fileName = scaner.nextLine();
                    try {
                        File file = new File(fileName);
                        if (file.createNewFile()) {
                            System.out.println("File created: " + file.getName());
                        } else {
                            System.out.println("File already exists.");
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Enter file name:");
                    fileName = scaner.nextLine();
                    File file = new File(fileName);
                    if (file.exists()) {
                        System.out.println("File name: " + file.getName());
                        System.out.println("Absolute path: " + file.getAbsolutePath());
                        System.out.println("Size: " + file.length() + " bytes");
                    } else {
                        System.out.println("File does not exist.");
                    }
                    break;
                case 3:
                    System.out.println("Enter file name:");
                    fileName = scaner.nextLine();
                    try {
                        FileWriter writer = new FileWriter(fileName);
                        System.out.println("Enter text to write:");
                        String text = scaner.nextLine();
                        writer.write(text);
                        writer.close();
                        System.out.println("Text written to file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Enter file name:");
                    fileName = scaner.nextLine();
                    try {
                        File readFile = new File(fileName);
                        Scanner fileReader = new Scanner(readFile);
                        while (fileReader.hasNextLine()) {
                            String line = fileReader.nextLine();
                            System.out.println(line);
                        }
                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Enter file name:");
                    fileName = scaner.nextLine();
                    file = new File(fileName);
                    if (file.delete()) {
                        System.out.println("File deleted: " + file.getName());
                    } else {
                        System.out.println("File does not exist.");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
