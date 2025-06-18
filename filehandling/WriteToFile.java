// package filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new  FileWriter("myFile.txt");
            myWriter.write("Files in Java might be tricky , but its a fun");
            myWriter.close();
            System.out.println("Succesfully wrote in the file");
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }    
}
