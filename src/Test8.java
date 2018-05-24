//Woongbeen Lee

import java.io.*;
import java.util.*;

public class Test8 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("Pythagoras.txt"));
        int[] arnX = new int[3];
        int[] arnY = new int[3];
        int nX1, nX2, nX3, nY1, nY2, nY3;
        double dSlope1 = 0, dSlope2 = 0, dSlope3 = 0, dNeg1, dNeg2, dNeg3;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 3; k++) {
                arnX[k] = scan.nextInt();
                arnY[k] = scan.nextInt();
            }
            nX1 = XY(arnX[0], arnX[1]);
            nY1 = XY(arnY[0], arnY[1]);
            nX2 = XY(arnX[1], arnX[2]);
            nY2 = XY(arnY[1], arnY[2]);
            nX3 = XY(arnX[2], arnX[0]);
            nY3 = XY(arnY[2], arnY[0]);
            if (nX1 == 0) {
                dSlope1 = 0;
            } else if (nX1 != 0) {
                dSlope1 = nY1 / nX1;
            }
            if (nX2 == 0) {
                dSlope2 = 0;
            } else if (nX2 != 0) {
                dSlope2 = nY2 / nX2;
            }
            if (nX3 == 0) {
                dSlope3 = 0;
            } else if (nX3 != 0) {
                dSlope3 = nY3 / nX3;
            }
            dNeg1 = 1 / (dSlope1 * -1);
            dNeg2 = 1 / (dSlope2 * -1);
            dNeg3 = 1 / (dSlope3 * -1);

            if (dSlope1 == 0 && dSlope2 == 0 || dSlope2 == 0 && dSlope3 == 0 || dSlope1 == 0 && dSlope3 == 0) {
                System.out.println("Set " + (i + 1) + " is a right triangle");
            } else {
                if (dSlope1 == dNeg2 || dSlope2 == dNeg3 || dSlope3 == dNeg1) {
                    System.out.println("Set " + (i + 1) + " is a right triangle");
                } else {
                    System.out.println("Set " + (i + 1) + " is not a right triangle");
                }
            }
        }
    }

    public static int XY(int nXY1, int nXY2) {
        int nXY;
        nXY = nXY2 - nXY1;
        return nXY;
    }
}