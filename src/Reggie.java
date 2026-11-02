import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(
                in, "Enter a sample SSN (###-##-####)",
                "^\\d{3}-\\d{2}-\\d{4}$");

        String studentNumber = SafeInput.getRegExString(
                in, "Enter a sample M number (M and five digits)",
                "^(M|m)\\d{5}$");

        String menuChoice = SafeInput.getRegExString(
                in, "Open, Save, View, or Quit [O/S/V/Q]",
                "^[OoSsVvQq]$");

        System.out.println("\nAccepted sample SSN: " + ssn);
        System.out.println("Accepted M number: " + studentNumber);
        System.out.println("Accepted menu choice: " + menuChoice);
    }
}