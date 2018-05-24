/* Read 3 coordinates of a triangle. Is it isosceles? Is it a right angle triangle? Which is the hnYpotenuse?
 */

import java.text.NumberFormat;
import java.io.*;
import java.util.*;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class e2e {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("e2e.txt"));
        int nX1, nX2, nX3, nY1, nY2, nY3, nCheck = 0;
        double dLeng1, dLeng2, dLeng3, dHypo;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nX1 = scan.nextInt();
        nY1 = scan.nextInt();
        nX2 = scan.nextInt();
        nY2 = scan.nextInt();
        nX3 = scan.nextInt();
        nY3 = scan.nextInt();
        dLeng1 = Length(nX1, nY1, nX2, nY2);
        dLeng2 = Length(nX2, nY2, nX3, nY3);
        dLeng3 = Length(nX3, nY3, nX1, nY1);
        dHypo = Hypotenuse(dLeng1, dLeng2, dLeng3);

        if (dLeng1 == dLeng2) {
            if (dLeng3 != dLeng1) {
                System.out.println("The triangle is isosceles");
            }
        } else if (dLeng1 == dLeng3) {
            if (dLeng2 != dLeng1) {
                System.out.println("The triangle is isosceles");
            }
        } else if (dLeng2 == dLeng3) {
            if (dLeng1 != dLeng2) {
                System.out.println("The triangle is isosceles");
            }
        }
        if (dHypo != 0) {
            System.out.println("The triangle is a right triangle");
            System.out.println("The hypotenuse is " + dHypo);
        }
    }

    public static double Length(int nX1, int nY1, int nX2, int nY2) {
        double dLeng;
        dLeng = sqrt(Math.pow(nX1 - nX2, 2) + Math.pow(nY1 - nY2, 2));
        return dLeng;
    }

    public static double Hypotenuse(double Leng1, double Leng2, double Leng3) {
        double[] SqL = new double[3];
        double dSum = 0;
        int nBig = 0;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        SqL[0] = Math.pow(Leng1, 2);
        SqL[1] = Math.pow(Leng2, 2);
        SqL[2] = Math.pow(Leng3, 2);
        for (int i = 0; i < 3; i++) {
            dSum += SqL[i];
            if (nBig < SqL[i]) {
                nBig = i;
            }
        }
        dSum -= SqL[nBig];
        nf.format(dSum);
        nf.format(SqL[nBig]);
        if (dSum == SqL[nBig]) {
            return dSum;
        }
        return 0;
    }
}