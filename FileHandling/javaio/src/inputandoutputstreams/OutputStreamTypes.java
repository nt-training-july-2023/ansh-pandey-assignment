package inputandoutputstreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTypes {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\output.txt");
        String st= "Ansh Pandey";
        byte b[]= st.getBytes("UTF-16");
        fileOutputStream.write(b);
        fileOutputStream.close();
        System.out.println("file is successfully updated");


    }
}
