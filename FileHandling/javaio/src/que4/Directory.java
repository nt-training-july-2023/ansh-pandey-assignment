package que4;

import java.io.File;
class DisplayFiles{
    public void printFileName(File[]arr,int i,int b){
        // i == a.length means the directory has
// no more files.
        if(i== arr.length){
            return;
        }
        // tabs for providing the indentation
// for the files of sub-directory
        for (int j = 0; j < b; j++)
        {
            System.out.print("\t");
        }
        if(arr[i].isFile()){
            System.out.println(arr[i].getName());
        }

        else if(arr[i].isDirectory())
        {
            System.out.println("[" + arr[i].getName() + "]");
// recursion for sub-directories
            printFileName(arr[i].listFiles(), 0,  b+ 1);
        }
// recursively printing files from the directory
// i + 1 means look for the next file
        printFileName(arr,i+1,b);
    }

}

public class Directory {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\anshp\\Documents");
        if(file.exists()&&file.isDirectory()){
            File arr[]= file.listFiles();
            System.out.println("--------------------");
            System.out.println("Displaying files "+file);
            System.out.println("--------------------");
            DisplayFiles displayFiles = new DisplayFiles();
            displayFiles.printFileName(arr,0,0);
        }
    }
}
