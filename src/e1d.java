/*The computer will calculate the total earnings for each employee. Output a list of the names and total earnings for each
employee. You will then give the user the option of displaying only those employees that make more than $300.
 */

import java.io.*;
import java.util.*;

public class e1d {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("e1d.txt"));
        Scanner sin = new Scanner(System.in);
        String[] arsFull = new String[4];
        double[] ardTotal = new double[4];
        String sFirst, sLast;
        double dWage;
        int nHour, nChoice;
        for (int i = 0; i < 4; i++) {
            sFirst = scan.next();
            sLast = scan.next();
            dWage = scan.nextDouble();
            nHour = scan.nextInt();
            arsFull[i] = sFirst + " " + sLast;
            ardTotal[i] = Total(dWage, nHour);
            System.out.println(arsFull[i] + " earns $" + ardTotal[i] + " in total");
        }

        System.out.println("Enter 1. Display employees with total earnings higher than $300 2. Exit");
        nChoice = sin.nextInt();

        if (nChoice == 1) {
            for (int i = 0; i < 4; i++) {
                if (ardTotal[i] > 300) {
                    System.out.println(arsFull[i]);
                }
            }
        } else {
            System.out.println("Bye");
        }
        scan.close();
    }

    public static double Total(double dWage, int nHour) {return dWage * nHour;}
}
