import java.util.*;
import java.io.*;

public class lms {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int choice;
        do {
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    public static void addBook() throws IOException {
        System.out.print("Enter book ID: ");
        int bookID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter book author: ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Enter book price: ");
        float bookPrice = scanner.nextFloat();
        scanner.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt", true));
        writer.write(bookID + "," + bookName + "," + bookAuthor + "," + bookPrice);
        writer.newLine();
        writer.close();

        System.out.println("Book added successfully.");
    }

    public static void displayBooks() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("books.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int bookID = Integer.parseInt(parts[0]);
            String bookName = parts[1];
            String bookAuthor = parts[2];
            float bookPrice = Float.parseFloat(parts[3]);

            System.out.println("Book ID: " + bookID);
            System.out.println("Book Name: " + bookName);
            System.out.println("Book Author: " + bookAuthor);
            System.out.println("Book Price: " + bookPrice);
            System.out.println();
        }

        reader.close();
    }

    public static void searchBook() throws IOException {
        System.out.print("Enter book id to search: ");
        // String bookName = scanner.nextLine();
        int bookid=scanner.nextInt();
        BufferedReader reader = new BufferedReader(new FileReader("books.txt"));

        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int bookID = Integer.parseInt(parts[0]);
            String currentBookName = parts[1];
            String bookAuthor = parts[2];
            float bookPrice = Float.parseFloat(parts[3]);

            // if (currentBookName.equalsIgnoreCase(bookName)) {
            //     System.out.println("Book ID: " + bookID);
            //     System.out.println("Book Name: " + currentBookName);
            //     System.out.println("Book Author: " + bookAuthor);
            //     System.out.println("Book Price: " + bookPrice);
            //     System.out.println();

            //     found = true;
            // }
            if(bookID==bookid){
                System.out.println("Book ID: " + bookID);
                System.out.println("Book Name: " + currentBookName);
                System.out.println("Book Author: " + bookAuthor);
                System.out.println("Book Price: " + bookPrice);
                System.out.println();

                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        reader.close();
    }


    public static void deleteBook() throws IOException {
        System.out.print("Enter book ID to delete: "); 
        int bookid=scanner.nextInt();
        BufferedReader reader = new BufferedReader(new FileReader("books.txt"));

        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int bookID = Integer.parseInt(parts[0]);
            String currentBookName = parts[1];
            String bookAuthor = parts[2];
            float bookPrice = Float.parseFloat(parts[3]);
         
        if(bookID==bookid){
            bookID=0;
            currentBookName=" ";
            bookAuthor=" ";
            bookPrice=0;

            found=true;
        }    
      }
      reader.close();
    }   
}  
   
   
    // class Book{
    //     private String title;
    //     private String author;
    //     private String isbn;
    
    //     public Book(String title,String author,String isbn){
    //         this.title=title;
    //         this.author=author;
    //         this.isbn=isbn;
    //     }
    
    //     public String getTitle(){
    //         return title;
    //     }
    
    //     public String getAuthor(){
    //         return author;
    //     }
    
    //     public String getIsbn(){
    //         return isbn;
    //     }
    
    //     @Override
    //     public String toString(){
    //         return "Title:"+title+"Author:"+author+"ISBN:"+isbn;
    //     }
    // }