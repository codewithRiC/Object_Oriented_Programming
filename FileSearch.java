import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileSearch {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Input address of source file :");
String source = sc.nextLine();
String Fulldata = "";
try {
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
List<Integer> indexes = new ArrayList<Integer>();
 String lowerCaseTextString = Fulldata.toLowerCase();
 String lowerCaseWord = FindWord.toLowerCase();
 int index = 0;
 while(index != -1){
 index = lowerCaseTextString.indexOf(lowerCaseWord, index);
 if (index != -1) {
 indexes.add(index);
 index++;
 }
 }
 
 //print the position of word
 int count = 0;
 System.out.println("Position of "+ FindWord+" is :");
 for(int j=0;j<indexes.size();j++) {
 System.out.println("Index : "+indexes.get(j));
 count = count +1;
 }
 System.out.println("Total number of occurence : "+ count);
 
Reader.close();
}catch(FileNotFoundException e) {
    System.out.println("An error has occured.");
//e.printStackTrace();
} catch (IOException e) {

//e.printStackTrace();
System.out.println("No such file found");
}
}
}