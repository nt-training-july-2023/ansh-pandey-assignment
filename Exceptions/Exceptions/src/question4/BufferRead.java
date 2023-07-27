package question4;

import java.io.*;

public class BufferRead {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anshp\\Desktop\\Nucleus Training\\Exceptions\\Exceptions\\Text.txt"));
        String Data;
        if((Data = br.readLine())!=null){
            System.out.println(Data);

        }
        System.out.println("REading is done");

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\anshp\\Desktop\\Nucleus Training\\Exceptions\\Exceptions\\print.txt"));
       Data = null;

        while((Data = br.readLine())!=null){
            bw.write(Data);
        }
       bw.close();

    }
}
