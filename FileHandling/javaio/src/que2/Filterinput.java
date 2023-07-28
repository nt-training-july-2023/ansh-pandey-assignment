package que2;

import java.io.*;

public class Filterinput {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\src\\Questions.txt");
        File output = new File("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\output.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FilterInputStream filterInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream1= new FileOutputStream(output);
        int i=0;
        while((i=filterInputStream.read())!=-1){
            System.out.print((char)i);
            fileOutputStream1.write(i);
        }
        filterInputStream.close();
        fileOutputStream1.close();
    }
}
