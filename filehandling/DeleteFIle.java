import java.io.File;

public class DeleteFIle {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        if(myFile.delete()){
            System.out.println("The file " + myFile.getName() + " has been deleted successfully");
        }else{
            System.out.println("file not deleted");
        }
    }
}
