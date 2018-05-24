/* A customer may write 5 cheques without charge. The bank charges $0.15 for every cheque written,
after the first 5 free ones. Output the customer's names and how much each owes the bank.
 */

import java.util.*;
import java.io.*;
import java.text.NumberFormat;

public class e1g {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("e1g.txt"));
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        String sFirst, sLast;
        int nNoC;
        double dTotal;
        for (int i = 0; i < 5; i++) {
            sFirst = scan.next();
            sLast = scan.next();
            nNoC = scan.nextInt() - 5;

            if (nNoC <= 0) {
                System.out.println(sFirst + " " + sLast + " owes no money");
            }
            else {
                dTotal = nNoC * 0.15;
                System.out.println(sFirst + " " + sLast + " owes $" + nf.format(dTotal));
            }
        }
        scan.close();
    }
}
