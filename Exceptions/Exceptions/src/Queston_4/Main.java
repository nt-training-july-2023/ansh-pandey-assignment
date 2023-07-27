package Queston_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("Text.txt");

        try {
            if (file.createNewFile()){
                System.out.println( "Create new file "+ file.getName());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
