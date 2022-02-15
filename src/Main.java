/*
 *
 * Author : Walt
 * JavaDocs has most operation needed for equations https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 *
 */

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
         *
         * declaration of variables
         *
         */
        Scanner in = new Scanner(System.in);
        int menuInput = in.nextInt();

        /*
         *
         * Main Menu
         *
         */
        while (menuInput == 0) {
            /*
             *
             * Conversion, imperial units and metric to International System of Units
             *
             */
            if (menuInput == 1) {
                System.out.println("MPH  to Meters?");
                double mphConvert = in.nextDouble();

            }

        }
    }

    // method for change in velocity

    // method for change in time

    // method for acceleration


}
