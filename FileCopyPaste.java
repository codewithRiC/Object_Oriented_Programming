import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileCopyPaste{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Input address of source file :");
String source = sc.nextLine();
try {
//FileInputStream sourceFile = new FileInputStream(source);
Path path = Paths.get(source);
byte[] arr = Files.readAllBytes(path);
System.out.println("Input address of destination file :");
String dest = sc.nextLine();
FileOutputStream fout1=new FileOutputStream(dest);
ByteArrayOutputStream bout=new ByteArrayOutputStream(); 
bout.write(arr);
bout.writeTo(fout1);
bout.flush(); 
 bout.close();
 System.out.println("Text copied sucessfully.");
}catch(IOException e) {
e.printStackTrace();
}
//sc.close();
}
}