package P05_ReadingAndWritingFiles;

/* 
   Diplay a text file.
   To use this program, specify the name
   of the file that you want to see.
   For example, to see a file called TEST.TXT,
   use the following command line.

   java ShowFile TEXT.TXT
*/

import java.io.*;

public class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;
        
        // First, confirm that a filename has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
        
        // Attemp to open the file.
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot open file");
            return;
        }
        
        // At this pint, the file is open and can be read.
        // The following reads characters until EOF is encountered.
        try {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Error reading file");
        }
        
        // Close the file.
        try {
            fin.close();
        } catch(IOException e) {
            System.out.println("Error closing file");
        }
    }
}
