import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
        File myObj = new File("myFile.txt");
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
            System.out.println("File read Succesfully!");
        }
        myReader.close();
    }catch(FileNotFoundException e){
        System.out.println("An error Occured");
        e.printStackTrace();
    }
    }
}
