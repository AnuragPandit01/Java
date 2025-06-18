import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        if(myFile.exists()){
            System.out.println("File Name : "+myFile.getName());
            System.out.println("Absolute Path : "+ myFile.getAbsolutePath());
            System.out.println("Writable : " +myFile.canWrite());
            System.out.println("Readable : "+ myFile.canRead());
            System.out.println("Executable : "  + myFile.canExecute());
            System.out.println("Hidden : "+ myFile.isHidden());
            System.out.println("File size in bytes : " + myFile.length());
        }else{
            System.out.println("File Not Found");
        }
    }
}
