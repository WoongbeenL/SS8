/* This program will read in 2 numbers and output the greatest common denominator for the two numbers.
 */

import java.util.*;
import java.io.*;

public class e1h {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new FileReader("e1h.txt"));
        int nFirst, nLast, nGCD;
        while (scan.hasNext()) {
            nFirst = scan.nextInt();
            nLast = scan.nextInt();
            nGCD = GCD(nFirst, nLast);
            System.out.println(nGCD);
        }
        scan.close();
    }

    public static int GCD (int First, int Last) {
        int nLimit, nGCD = 0, nMod1, nMod2;
        nLimit = First;
        if (nLimit < Last) nLimit = Last;
        for (int i = 1; i < nLimit; i++) {
            nMod1 = First % i;
            nMod2 = Last % i;
            if (nMod1 == 0 && nMod2 == 0) {
                nGCD = i;
            }
        }
        return nGCD;
    }
}
