/* Read the coodinates of 2 lines. Assess whether these 2 lines are perpendicular.
(2 lines a perpendicular if the slopes are negative reciprocals).
 */

 import java.io.*;
import java.util.*;

public class e2c {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("e2c.txt"));
        int nX[] = new int[4];
        int nY[] = new int[4];
        int nX1, nX2, nY1, nY2;
        double dSlope1, dSlope2, dCheck;
        for (int i = 0; i < 4; i++) {
            nX[i] = scan.nextInt();
            nY[i] = scan.nextInt();
        }
        nX1 = Xcoordinate(nX[0], nX[1]);
        nX2 = Xcoordinate(nX[2], nX[3]);
        nY1 = Ycoordinate(nY[0], nY[1]);
        nY2 = Ycoordinate(nY[2], nY[3]);
        dSlope1 = nX1 / nY1;
        dSlope2 = nY2 / nX2;
        dCheck = dSlope2 * -1;
        if (dSlope1 == dCheck) {
            System.out.println("The 2 lines are perpendicular");
        } else {
            System.out.println("The 2 lines are not perpendicular");
        }
        scan.close();
    }

    public static int Xcoordinate(int x1, int x2) {return x1 - x2;}

    public static int Ycoordinate(int y1, int y2) {return y1 - y2;}
}
