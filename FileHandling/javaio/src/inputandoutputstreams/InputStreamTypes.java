package inputandoutputstreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTypes {
    public static void main(String[] args) throws IOException {

        // using FileInputStream class


        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\new.txt");
        int num =1;
        while(( num =fileInputStream.read())!=-1){
            System.out.println((char)num);
            fileInputStream.close();
        }
        System.out.println("Completed");

    }
}
