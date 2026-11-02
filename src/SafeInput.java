import java.util.Scanner;

public class SafeInput {

    // Part A
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String value;

        do {
            System.out.print("\n" + prompt + ": ");
            value = pipe.nextLine();
        } while (value.length() == 0);

        return value;
    }

    // Part B
    public static int getInt(Scanner pipe, String prompt) {
        int value;

        while (true) {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                return value;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid integer: " + trash);
            }
        }
    }

    // Part C
    public static double getDouble(Scanner pipe, String prompt) {
        double value;

        while (true) {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid number: " + trash);
            }
        }
    }

    // Part D
    public static int getRangedInt(Scanner pipe, String prompt,
                                   int low, int high) {
        int value;

        while (true) {
            System.out.print("\n" + prompt
                    + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    return value;
                }

                System.out.println("Number is outside the allowed range.");
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid integer: " + trash);
            }
        }
    }

    // Part E
    public static double getRangedDouble(Scanner pipe, String prompt,
                                         double low, double high) {
        double value;

        while (true) {
            System.out.print("\n" + prompt
                    + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    return value;
                }

                System.out.println("Number is outside the allowed range.");
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid number: " + trash);
            }
        }
    }

    // Part F
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;

        while (true) {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                return true;
            } else if (response.equalsIgnoreCase("N")) {
                return false;
            }

            System.out.println("Invalid response. Enter Y or N.");
        }
    }

    // Part G
    public static String getRegExString(Scanner pipe, String prompt,
                                        String regEx) {
        String response;

        while (true) {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();

            if (response.matches(regEx)) {
                return response;
            }

            System.out.println("Invalid format. Please try again.");
        }
    }

    // Part H: Used by PrettyHeader.java
    public static void prettyHeader(String msg) {
        // The space between the two groups of three stars is 54 wide.
        if (msg.length() > 54) {
            throw new IllegalArgumentException(
                    "Message must be 54 characters or fewer.");
        }

        int leftSpaces = (54 - msg.length()) / 2;
        int rightSpaces = 54 - msg.length() - leftSpaces;

        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}