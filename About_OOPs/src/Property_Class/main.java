package Property_Class;

import java.io.*;
import java.util.Properties;

// If any information is changed then re compilation is not required
public class main {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\anshp\\Desktop\\Nucleus Training\\OOPs\\About_OOPs\\src\\Property_Class\\ansh.properties");
        p.load(fis);
        System.out.println(p);
//

//        p.setProperty("url","https://google.com");
//        p.setProperty("pass","99999");
        if (p.getProperty("url").equals("https://google.com"))
            System.out.println("hello");
        p.setProperty("url","https://facebook.com");
        FileOutputStream FOS = new FileOutputStream("C:\\Users\\anshp\\Desktop\\Nucleus Training\\OOPs\\About_OOPs\\src\\Property_Class\\ansh.properties");
        p.store(FOS," Properties Example");

//        if(p.getProperty("name").equals("Ansh Pandey"))
//            System.out.println("Hello Ansh");

    }
}
