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
                printHeader();
                int userInput = getInput();
                performAction(userInput);
            }
        }

        private void printHeader() {
            System.out.println("**************************************************");
            System.out.println("|           Physics Calculator                   |");
            System.out.println("|            Convert to ISU                      |");
            System.out.println("**************************************************");
        }

        private void printMenu() {
            System.out.println("0 - to quit menu");
            System.out.println("1 - Convert to ISU");
        }

        private int getInput() {
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

}
