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
    boolean convertToMain;
    boolean vectorToMain;

    public static void main(String[] args) {

        Main menu = new Main();
        menu.runner();
    }

        public void runner() {
            while (!exit) {
                printMenu();
                int userInput = getMenuInput();
                performAction(userInput);
            }
        }

        /*
         *
         * print menu and headers
         *
         */

        private void printIsuHeader() {
            System.out.println("\n**************************************************");
            System.out.println("|           Physics Calculator                   |");
            System.out.println("|            Convert to ISU                      |");
            System.out.println("**************************************************\n");
        }

        private void printVectorHeader() {
            System.out.println("\n**************************************************");
            System.out.println("|           Physics Calculator                   |");
            System.out.println("|            Vector Calculator                   |");
            System.out.println("**************************************************\n");
        }

        private void printMenu() {
            System.out.println("\n**************************************************");
            System.out.println("|           Physics Calculator                   |");
            System.out.println("|               Main Menu                        |");
            System.out.println("**************************************************\n");
            System.out.println("0 - Close Application");
            System.out.println("1 - Convert to ISU");
            System.out.println("2 - Vectors Calculator");
        }

        /*
         *
         * getting user input
         *
         */

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

        private double getNumInputDouble() {
            Scanner num = new Scanner(System.in);
            double numInput = -1;
            numInput = Double.parseDouble(num.nextLine());
            return numInput;
        }

        private float getNumInputFloat() {
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
                case 2:
                    vectorCalculator();
                    break;
                default:
                    System.out.println("An unknown error has occurred");
            }
        }

        /*
        *
        * Conversion of units
        *
        */

        private void convertUnits() {

            while (!convertToMain) {

                printIsuHeader();

                System.out.println("0 - Back to Main Menu");
                System.out.println("1 - MPH to Meters");
                System.out.println("2 - KHM to Meters");
                System.out.println("3 - Feet to Meters");
                System.out.println("4 - Centimeters to Meters");

                int menuInput = getMenuInput();

                switch (menuInput) {
                    case 0:
                        convertToMain = true;
                        break;
                    case 1:
                        mphToM();
                        break;
                    case 2:
                        khmToM();
                        break;
                    case 3:
                        feetToM();
                        break;
                    case 4:
                        cmToM();
                        break;
                    default:
                }
            }
        }

        private void mphToM() {
            float m = 0;
            float conversion = Float.parseFloat(".44704");
            System.out.println("Enter Miles Per Hour to convert");
            float numToConvert = getNumInputFloat();
            m = numToConvert * conversion;
            System.out.println("Miles per Hour to Meters per Second: " + m + "\n");
        }

        private void khmToM() {
            float m = 0;
            float conversion = Float.parseFloat("0.277778");
            System.out.println("Enter Kilometers Per Hour to convert");
            float numToConvert = getNumInputFloat();
            m = numToConvert * conversion;
            System.out.println("Kilometers per Hour to Meters per Second: " + m + "\n");
        }

        private void feetToM() {
            float m = 0;
            float conversion = Float.parseFloat("3.28084");
            System.out.println("Enter Feet to convert to Meters");
            float numToConvert = getNumInputFloat();
            m = numToConvert * conversion;
            System.out.println("Feet to Meters: " + m + "\n");
        }

        private void cmToM() {
            float m = 0;
            float conversion = Float.parseFloat(".01");
            System.out.println("Enter Centimeters to convert to Meters");
            float numToConvert = getNumInputFloat();
            m = numToConvert * conversion;
            System.out.println("Centimeters to Meters: " + m + "\n");
        }

        /*
         *
         * Vector Calculation
         *
         */

        private void vectorCalculator() {

            while (!vectorToMain) {

                printVectorHeader();

                System.out.println("0 - Back to Main Menu");
                System.out.println("1 - Velocity of x-component");
                System.out.println("2 - Get Velocity from Components");

                int menuInput = getMenuInput();

                switch (menuInput) {
                    case 0:
                        vectorToMain = true;
                        break;
                    case 1:
                        getVelocityOfXAndYComponent();
                        break;
                    case 2:
                        getVelocityFromComponents();
                        break;
                    default:
                }
            }
        }

        private void getVelocityOfXAndYComponent() {
            System.out.println("Enter your magnitude: ex 4.0");
            double magnitude = getNumInputDouble();
            System.out.println("Enter the degrees");
            double theta = getNumInputDouble();

            double xVelocity = magnitude * Math.cos(Math.toRadians(theta));
            double roundUpX = (double) Math.round(xVelocity * 100) / 100;
            double yVelocity = magnitude * Math.sin(Math.toRadians(theta));
            double roundUpY = (double) Math.round(yVelocity * 100) / 100;
            System.out.println("The velocity of the x and y components are: " + roundUpX + "m, " + roundUpY + "m" + "\n");
        }

        private void getVelocityFromComponents() {
            System.out.println("Enter your x-coordinate");
            double xCoor = getNumInputDouble();
            System.out.println("Enter your y-coordinate");
            double yCoor = getNumInputDouble();

            double velocity = Math.sqrt(((xCoor * xCoor) + (yCoor * yCoor)));
            double velRoundUp = (double) Math.round(velocity * 100) / 100;
            System.out.println("The Velocity of the x and y coordinates are: " + velRoundUp + "m\n");
        }



}
