package que5;



  import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContent1 {
        public static void main(String[] args) throws IOException {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\new.txt");
            System.out.println("The available bytes for read is "+ fileInputStream.available());
            for(int i =0; i<10; i++){
                char c = (char)fileInputStream.read();
                System.out.print(c);

            }
            byte b[] = new byte[fileInputStream.available()];
            fileInputStream.read(b);

            String str = new String(b);
//        System.out.println(str);
            // is skip
            // fileInputStream.skip(10);




            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\output.txt");
            fileOutputStream.write(b);
            fileOutputStream.close();
            fileInputStream.close();
        }
    }