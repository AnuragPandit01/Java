import java.io.File;
import java.io.IOException;
//file handling
public class CreateFile {
    public static void main(String[] args) {
        //creating file
        try{
            File myObj = new File("myFile.txt");
            if(myObj.createNewFile()){
                System.out.println("File created "+myObj.getName());
            }else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
            System.out.println("An error Occured");
            e.printStackTrace();
        }

        
    }
}
