/* Write a program that counts and displays on screen the number of words in an input file.
All words in the file are separated by blank spaces or end of lines.
 */

import java.io.*;
import java.util.*;

public class e2a {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new FileReader("e2a.txt"));
        int nCount = 0;
        String sLine;
        String[] arsLength;
        while (scan.hasNext()) {
            sLine = scan.nextLine();
            arsLength = sLine.split(" ");
            nCount += arsLength.length;
        }
        System.out.println("There are " + nCount + " words in a file");
        scan.close();
    }
}
