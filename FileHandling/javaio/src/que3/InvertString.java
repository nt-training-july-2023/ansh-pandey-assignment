package que3;

import java.io.*;
import java.util.ArrayList;

public class InvertString {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\new.txt");
        File output = new File("C:\\Users\\anshp\\Desktop\\Nucleus Training\\FileHandling\\javaio\\output.txt");
        BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
        String s="";
        ArrayList<String> arrayList= new ArrayList<>();
        int line =0;
       while((s= bufferedReader.readLine())!=null){
           line++;
           arrayList.add(s);
           System.out.println(s);

       }
        System.out.println(line);
       for(int i=line-1; i>=0;i--){
           bufferedWriter.write(arrayList.get(i));
           bufferedWriter.newLine();

       }
       bufferedReader.close();
       bufferedWriter.close();
    }
}
