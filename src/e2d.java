/* Read 3 coordinates of a triangle ABC. Find the centroid. (p. 33 of your grade 10 text) The centroid is
the intersection point of the medians of a triangle. A median are the mid-point of one side and the opposite axis.
 */

import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class e2d {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("e2d.txt"));
        int arnX[] = new int[3];
        int arnY[] = new int[3];
        int nCx, nCy, nXsum, nYsum;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        for (int i = 0; i < 3; i++) {
            arnX[i] = scan.nextInt();
            arnY[i] = scan.nextInt();
        }
        nXsum = Centroid(arnX);
        nYsum = Centroid(arnY);
        nCx = nXsum % 3;
        nCy = nYsum % 3;
        if (nCx == 0 && nCy == 0) {
            System.out.println("The centroid is " + nXsum / 3 + ", " + nYsum / 3);
        } else if (nCx == 0 && nCy != 0) {
            System.out.println("The centroid is " + nXsum / 3 + ", " + nYsum + "/3");
        } else if (nCx != 0 && nCy == 0) {
            System.out.println("The centroid is " + nXsum + "/3, " + nYsum / 3);
        } else {
            System.out.println("The centroid is " + nXsum + "/3, " + nYsum + "/3");
        }
        scan.close();
    }

    public static int Centroid(int[] Coordinate) {
        int nSum = 0;
        for (int i = 0; i < 3; i++) {
            nSum += Coordinate[i];
        }
        return nSum;
    }
}
