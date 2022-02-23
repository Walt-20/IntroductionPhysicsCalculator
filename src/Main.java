/*
 *
 * Author : Walt
 * JavaDocs has most operation needed for equations https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 *
 */

import java.lang.Math;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    boolean exit;
    boolean convertToMain;
    boolean vectorToMain;
    boolean kineticsBackToMain;

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

    private void printKineticsHeader() {
        System.out.println("\n**************************************************");
        System.out.println("|           Physics Calculator                   |");
        System.out.println("|           Kinetics Calculator                  |");
        System.out.println("**************************************************\n");
    }

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
            System.out.println("3 - Kinetics in One Dimension");
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

        /*
         *
         * Input methods
         *
         */

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

        private String getStringInput() {
            Scanner str = new Scanner(System.in);
            String userInput = "";
            userInput = str.nextLine();
            return userInput;
        }

        private double getNumericalValue(String userInput) {
            String north = "north";
            String south = "south";
            double numericalOutput = 0.0;
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) >= 48 && userInput.charAt(i) <= 57) {
                    numericalOutput = Double.parseDouble(userInput.substring(0, i + 1));
                }
            }
            for (int j = 0; j < userInput.length(); j++) {
                if (userInput.equals(north)) {
                    numericalOutput = numericalOutput * 1;
                } else if (userInput.equals(south)) {
                    numericalOutput = numericalOutput * -1;
                }
            }
            return numericalOutput;
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
                case 3:
                    kineticsIn1DCalculator();
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
                System.out.println("5 - Multiplying two scientific numbers");
                System.out.println("6 - Dividing two scientific numbers");

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
                    case 5:
                        multiplyTwoScientificNums();
                        break;
                    case 6:
                        dividingTwoScientificNums();
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
            System.out.println("Miles per Hour to Meters per Second: " + m + "m/s\n");
        }

        private void khmToM() {
            float m = 0;
            float conversion = Float.parseFloat("0.277778");
            System.out.println("Enter Kilometers Per Hour to convert");
            float numToConvert = getNumInputFloat();
            m = numToConvert * conversion;
            System.out.println("Kilometers per Hour to Meters per Second: " + m + "m/s\n");
        }

        private void feetToM() {
            float m = 0;
            float conversion = Float.parseFloat("3.28084");
            System.out.println("Enter Feet to convert to Meters");
            float numToConvert = getNumInputFloat();
            m = numToConvert * conversion;
            System.out.println("Feet to Meters: " + m + "m/s\n");
        }

        private void cmToM() {
            float m = 0;
            float conversion = Float.parseFloat(".01");
            System.out.println("Enter Centimeters to convert to Meters");
            float numToConvert = getNumInputFloat();
            m = numToConvert * conversion;
            System.out.println("Centimeters to Meters: " + m + "m/s\n");
        }

        private void multiplyTwoScientificNums() {
            float coefficientResult = 0;
            float exponentResult = 0;
            System.out.println("Enter your the first coefficient ex: 4.5");
            float m1 = getNumInputFloat();
            System.out.println("Enter your the first exponent ex: 12");
            float exp1 = getNumInputFloat();
            System.out.println("Enter your the second coefficient ex: 6.6");
            float m2 = getNumInputFloat();
            System.out.println("Enter your the second exponent ex: 4");
            float exp2 = getNumInputFloat();

            coefficientResult = (m1 * m2);
            exponentResult = (exp1 + exp2);

            BigDecimal decimalCoefficient = null;
            if (coefficientResult > 10.0) {

                // object to correct decimal places for scientific notation conversion
                BigDecimal bd = new BigDecimal(coefficientResult);

                // pointer to move n decimal places
                int i = 1;
                decimalCoefficient = bd.movePointLeft(i);

                exponentResult++;

            }

            System.out.println("The product is: " + String.format("%.1f", decimalCoefficient) + "E" + ((int) (exponentResult)));
        }

        private void dividingTwoScientificNums() {
            double coefficientResult = 0.0;
            double exponentResult = 0.0;
            System.out.println("Enter your the first coefficient ex: 4.5");
            double m1 = getNumInputDouble();
            System.out.println("Enter your the first exponent ex: 12");
            double exp1 = getNumInputDouble();
            System.out.println("Enter your the second coefficient ex: 6.6");
            double m2 = getNumInputDouble();
            System.out.println("Enter your the second exponent ex: 4");
            double exp2 = getNumInputDouble();

            coefficientResult = (m1 / m2);
            exponentResult = (exp1 - exp2);

            BigDecimal decimalCoefficient = null;

            // object to correct decimal places for scientific notation conversion
            BigDecimal bd = new BigDecimal(coefficientResult);

            // pointer to move n decimal places
            int i = 1;
            decimalCoefficient = bd.movePointRight(i);

            exponentResult--;


            System.out.println("The product is: " + String.format("%.2f", decimalCoefficient) + "E" + ((int) (exponentResult)));
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
                System.out.println("3 - Solving Linear Equations");

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

        /*
         *
         * Kinetics In One Dimension
         *
         */

        private void kineticsIn1DCalculator() {

            while (!kineticsBackToMain) {

                printKineticsHeader();

                System.out.println("0 - Back to Main Menu");
                System.out.println("1 - Average Velocity");
                System.out.println("2 - Position at Time");
                System.out.println("3 - Solve for Time");
                System.out.println("4 - Solve for Velocity");

                int menuInput = getMenuInput();

                switch (menuInput) {
                    case 0:
                        kineticsBackToMain = true;
                        break;
                    case 1:
                        getAverageVelocity();
                        break;
                    case 2:
                        solveForPosition();
                        break;
                    case 3:
                        solveForTime();
                        break;
                    case 4:
                        solveForVelocity();
                        break;
                    default:
                }
            }
        }

        private void getAverageVelocity() {
            // formula average velocity = displacement s / change in time t
            double avgVelocity = 0.0;
            System.out.println("Enter the displacement: [ex. 5km north]");
            String displacement = getStringInput();
            System.out.println("Enter the change in time: [ex. 1 hour]");
            String changeInTime = getStringInput();
            // parse the string and change numerical input into double
            double numericalS = getNumericalValue(displacement);
            double numericalT = getNumericalValue(changeInTime);

            avgVelocity = numericalS / numericalT;

            System.out.println("The Average Velocity is: " + avgVelocity);
        }

        private void solveForPosition() {
            // formula for time = initial velocity + initial position
            System.out.println("Time in seconds: [ex. 4]");
            double time = getNumInputDouble();
            System.out.println("Initial Velocity in meters: [ex. 5.0]");
            double velocity = getNumInputDouble();
            System.out.println("Initial position in meters: [ex. 0.0]");
            double position = getNumInputDouble();

            double posAtTime = (velocity * time) + (position);
            System.out.println("The postion at time: " + time + " is: " + posAtTime);
        }

        private void solveForTime() {
            // formula to solve for time = velocity - initial velocity / acceleration
            System.out.println("What is the initial velocity?");
            double velO = getNumInputDouble();
            System.out.println("What is the velocity?");
            double velocity = getNumInputDouble();
            System.out.println("What is the acceleration?");
            double acc = getNumInputDouble();

            double time = ((velocity - velO) / acc);
            System.out.println("The time is: " + time);
        }

        private void solveForVelocity() {

        }

}
