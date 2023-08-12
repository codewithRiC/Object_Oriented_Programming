import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileSearchReplace {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Input address of source file :");
String source = sc.nextLine();
String Fulldata = "";
try {
//get path of file
File path = new File(source);
FileInputStream Reader = new FileInputStream(path);
int i=0;
while((i=Reader.read())!=-1) {
Fulldata += (char)i;
}
System.out.println(Fulldata);
//search for word
System.out.println("\nEnter word to find :");
String FindWord = sc.nextLine();
//enter word to replace
System.out.println("Enter word to replace "+ FindWord);
String RepWord = sc.nextLine();
 
 //Replace a word
 Fulldata = Fulldata.replaceAll(FindWord, RepWord);
 
 FileOutputStream fout = new FileOutputStream(path);
 BufferedOutputStream bout = new BufferedOutputStream(fout);
 byte[] b = Fulldata.getBytes();
 bout.write(b);
 bout.close();
 fout.close();
System.out.println("Successfully replaced.");
 
 
 
Reader.close();
}catch(FileNotFoundException e) {
System.out.println("An error has occured.");
} catch (IOException e) {
;
System.out.println("No such file found");
}
}
}