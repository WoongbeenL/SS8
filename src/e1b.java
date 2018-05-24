/* Have the program read a series of names from an input file: both first and last name.
Only send to the output file those names that are properly entered: First letter capitalized. The rest in lower casing.
 */

import java.io.*;
import java.util.*;

public class e1b {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new FileReader("e1b.txt."));
        String[] arsFull;
        String sFull;
        boolean bFirst, bLast;
        while (scan.hasNext()) {
            sFull = scan.nextLine();
            arsFull = sFull.split(" ");
            bFirst = isGood(arsFull[0]);
            bLast = isGood(arsFull[1]);
            if (bFirst && bLast) {
                System.out.println(sFull);
            }
        }
        scan.close();
    }

    public static boolean isGood(String sName) {
        char ch;
        ch = sName.charAt(0);
        if (!Character.isAlphabetic(ch)) return false;
        if (Character.isLowerCase(ch)) return false;
        for (int i = 1; i < sName.length(); i++) {
            ch = sName.charAt(i);
            if (!Character.isAlphabetic(ch)) return false;
            if (Character.isUpperCase(ch)) return false;
        }
        return true;
    }
}
