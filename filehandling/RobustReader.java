import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the file name");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read())!= -1){
                System.out.print((char)read);
            }
        }catch(FileNotFoundException e){
            System.out.printf("%s not found",fileName);
        }catch(IOException e){
            System.out.printf("Exception Occured : %S",e.getMessage());
        }
    }
}
