/*
 *
 * Author : Walt
 * JavaDocs has most operation needed for equations https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 *
 */

import java.lang.Math;
import java.util.Scanner;

public class Main {

    boolean exit;

    public static void main(String[] args) {

        Main menu = new Main();
        menu.runner();
    }

        public void runner() {
            printHeader();
            while (!exit) {
                printMenu();
                int userInput = getMenuInput();
                performAction(userInput);
            }
        }

        private void printHeader() {
            System.out.println("\n**************************************************");
            System.out.println("|           Physics Calculator                   |");
            System.out.println("|            Convert to ISU                      |");
            System.out.println("**************************************************\n");
        }

        private void printMenu() {
            System.out.println("0 - to quit menu");
            System.out.println("1 - Convert to ISU");
        }

        private int getMenuInput() {
            Scanner scr = new Scanner(System.in);
            int menuInput = -1;
            while (menuInput < 0) {
                try {
                    menuInput = Integer.parseInt(scr.nextLine());
                }
                catch (NumberFormatException e) {
                    System.out.println("Your menu options are");
                }
            }
            return menuInput;
        }

        private float getNumInput() {
            Scanner num = new Scanner(System.in);
            float numInput = -1;
            numInput = Float.parseFloat(num.nextLine());
            return numInput;
        }

        private void performAction(int menuInput) {
            switch (menuInput) {
                case 0:
                    exit = true;
                    System.out.println("Closed Application");
                    break;
                case 1:
                    convertUnits();
                    break;
                default:
                    System.out.println("An unknown error has accured");
            }
        }

        private void convertUnits() {
            System.out.println("0 - Exit to Main Menu");
            System.out.println("1 - MPH to Meters");
            System.out.println("2 - KHM to Meters");
            System.out.println("3 - Feet to Meters");
            System.out.println("4 - Centimeters to Meters");

            int menuInput = getMenuInput();

            switch(menuInput) {
                case 0:
                    break;
                case 1:
                    mphToM();
                case 2:
                case 3:
                case 4:
                default:
            }
        }

        private void mphToM() {
            float m = 0;
            float conversion = Float.parseFloat(".44704");
            System.out.println("Enter Miles Per Hour to convert");
            float numToConvert = getNumInput();
            m = numToConvert * conversion;
            System.out.println("Miles per Hour to Meters per Second: " + m + "\n");
        }
}
