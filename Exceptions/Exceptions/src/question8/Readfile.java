package question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readfile {

    public void readfile(String Files, String path) throws IOException {
        File file = new File(path,Files);
        if(!file.exists()){
            file.createNewFile();
        }
        // Reading the file
        FileReader fileReader= new FileReader(file);
        int c =fileReader.read();
        try {
            while (c != -1) {
                System.out.println((char) c);
                //read next character
                c = fileReader.read();
            }
            fileReader.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
//        File file = new File("Text.txt");
//        try {
//            if(!file.exists()) {
//                file.createNewFile();
//            }
//        } catch (IOException e) {
//            System.out.println("not found ");
//            throw new RuntimeException(e);
//        }
        // Reading the file

        String FileName;
        String path;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter file name");
        FileName  = Sc.nextLine();
        System.out.println("Enter path");
        path =  Sc.nextLine();

        Readfile readFile = new Readfile();
        //Reading file

        try {
            readFile.readfile(FileName,path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            Sc.close();
        }
        System.out.println("Done");


    }
}
