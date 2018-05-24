/* Write a program that will determine what the longest word in a file is. The program will display the word and its length.
 */

import java.io.*;
import java.util.*;

public class e2b {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("e2b.txt"));
        int nCount = 0;
        String sInp, sWord = "";
        while (scan.hasNext()) {
            sInp = scan.next();
            if (sInp.length() > sWord.length()) {
                sWord = "";
                sWord += sInp;
            }
        }
        System.out.println(sWord + " is the longest word and is " + sWord.length() + " letters long");
        scan.close();
    }
}
