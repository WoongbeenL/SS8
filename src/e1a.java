/*Read in the file e1a.txt. It contains four marks (average) of some students.
The number of students is under 10. Display the averages of these students, and the student with the highest mark.
 */

import java.text.NumberFormat;
import java.io.*;
import java.util.*;

public class e1a {
    public static void main(String[] args) throws IOException {
        // LOLOLOLO
        // sup
        Scanner scan = new Scanner(new FileReader("e1a.txt."));
        double dAve = 0;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(0);
        for (int i = 0; i < 4; i++) {
            dAve = 0;
            for (int j = 0; j < 4; j++) {
                dAve += scan.nextInt();
            }
            dAve /= 4;
            System.out.println("The average is " + nf.format(dAve));
        }
        scan.close();
    }
}
