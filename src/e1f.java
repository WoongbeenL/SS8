/* a. The computer will display the name of all the students as well as the overall average of
the three subject marks that are in the data list.
b. The computer will display those students that earned greater than 80% in history class.
c. The computer will display only those students that passed ALL of their courses.
d. The computer will display the those students that passed either Math or English.
e. The computer will display those students that failed no courses or just one.
 */

import java.util.*;
import java.io.*;
import java.text.NumberFormat;

public class e1f {
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("e1f.txt"));
        Scanner scan = new Scanner(System.in);
        int[] arnHis = new int[7];
        int[] arnMath = new int[7];
        int[] arnEng = new int[7];
        int nCount = 0, nCheck = 0;
        double dAve;
        String[] arsFull = new String[7];
        String sFirst, sLast;
        char ch;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        while (sin.hasNext()) {
            sFirst = sin.next();
            sLast = sin.next();
            arsFull[nCount] = sFirst + " " + sLast;
            arnHis[nCount] = sin.nextInt();
            arnMath[nCount] = sin.nextInt();
            arnEng[nCount] = sin.nextInt();
            nCount++;
        }
        System.out.println("Enter your choice \n" +
                "a. The computer will display the name of all the students as well as the overall average of\n" +
                "   the three subject marks that are in the data list.\n" +
                "b. The computer will display those students that earned greater than 80% in history class.\n" +
                "c. The computer will display only those students that passed ALL of their courses.\n" +
                "d. The computer will display the those students that passed either Math or English.\n" +
                "e. The computer will display those students that failed no courses or just one.");
        ch = scan.next().charAt(0);
        if (ch == 'a') {
            for (int i = 0; i < arsFull.length; i++) {
                dAve = a(arnHis[i], arnMath[i], arnEng[i]);
                System.out.println(arsFull[i] + "'s average is " + nf.format(dAve));
            }
        } else if (ch == 'b') {
            for (int i = 0; i < arsFull.length; i++) {
                if (arnHis[i] >= 80) {
                    System.out.println(arsFull[i] + " earned greater than 80% in history");
                }
            }
        } else if (ch == 'c') {
            for (int i = 0; i < arsFull.length; i++) {
                if (arnHis[i] >= 50 && arnMath[i] >= 50 && arnEng[i] >= 50) {
                    System.out.println(arsFull[i] + " passed all of their courses");
                }
            }
        } else if (ch == 'd') {
            for (int i = 0; i < arsFull.length; i++) {
                if (arnMath[i] >= 50 || arnEng[i] >= 50) {
                    System.out.println(arsFull[i] + "passed either Math or English");
                }
            }
        }
        else if(ch == 'e') {
            for (int i = 0; i < arsFull.length; i++) {
                nCheck = e(arnHis[i], arnMath[i], arnEng[i]);
                if (arnHis[i] < 50) nCheck++;
                if (arnMath[i] < 50) nCheck++;
                if (arnEng[i] < 50) nCheck++;
                if (nCheck <= 1) {
                    System.out.println(arsFull[i] + " failed no courses or just one course");
                }
            }
        }
        scan.close();
    }

    public static double a(int nHis, int nMath, int nEng) {
        return (nHis + nMath + nEng) / 3;
    }

    public static int e(int nHis, int nMath, int nEng) {
        int nCheck = 0;
        if (nHis < 50) nCheck++;
        if (nMath < 50) nCheck++;
        if (nEng < 50) nCheck++;
        return nCheck;
    }
}
