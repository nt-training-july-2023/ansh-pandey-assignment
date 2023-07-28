package que5;

//
////ByteArrayInputStream class of java.io package contains all the buffers,
//// containing bytes to be read from the Input Stream.
//
//public class ByteArrayInputStream
//        extends InputStream

import java.io.*;

public class CopyContent {
    //Methods of this class can be called even after closing the Stream, there is no effect of it on the class methods.
    public static void main(String[] args) throws IOException {

        // In this Array will be the source
//ByteArrayInputStream(byte[] buf, int offset, int length)
        //ByteArrayInputStream(byte[] buffer)
        File file = new File("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\new.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line= bufferedReader.readLine();
        StringBuilder sb=new StringBuilder();
        while(line!=null){
            sb.append(line);
            sb.append("\n");
            line= bufferedReader.readLine();
        }
        String s=sb.toString();
        System.out.println("this is string  "+s);





        byte b[] = s.getBytes();


        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        int num =0;
        while((num =byteArrayInputStream.read())!=-1){
            // System.out.print((char)num);
            byteArrayInputStream.close();
        }
        //byte output stream
        // write on a buffer
        //write to anorher stream
        byte b1[]= {100};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b);
        //byteArrayOutputStream.reset();
        // System.out.println(byteArrayOutputStream.toString());
        // they are same but this time array is our sourcce or destination
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\output.txt");
        byteArrayOutputStream.writeTo(fileOutputStream);

    }
}
