/* The program will read one-line sentences from the input file. The program will display the number of words,
and the length of the each word, as well as the number of “e’s” in the sentence.
 */

import java.util.*;
import java.io.*;

public class e1c {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("e1c.txt"));
        String sInp;
        String[] arsWord;
        int nLength, nNumofeWord, nNumofeLine = 0;
        sInp = scan.nextLine();
        arsWord = sInp.split(" ");
        for (int i = 0; i < arsWord.length; i++) {
            nLength = Length(arsWord[i]);
            nNumofeWord = NumofE(arsWord[i]);
            nNumofeLine += nNumofeWord;
            System.out.println("The word has " + nLength + " letters");
        }
        System.out.println("The sentence has " + arsWord.length + " words and " + nNumofeLine + " e's");
        scan.close();
    }

    public static int Length(String sInp) {
        char ch;
        int nLength = 0;
        for (int i = 0; i < sInp.length(); i++) {
            ch = sInp.charAt(i);
            if (Character.isAlphabetic(ch)) {
                nLength++;
            }
        }
        return nLength;
    }

    public static int NumofE(String sInp) {
        int nCount = 0;
        char ch;
        ch = sInp.charAt(0);
        if (ch == 'e' || ch == 'E') {
            nCount++;
        }
        for (int i = 1; i < sInp.length(); i++) {
            ch = sInp.charAt(i);
            if (ch == 'e' || ch == 'E') {
                nCount++;
            }
        }
        return nCount;
    }
}
