import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String code = SafeInput.getRegExString(
                in,
                "Enter two uppercase letters and three digits",
                "^[A-Z]{2}\\d{3}$");

        System.out.println("Accepted code: " + code);
    }
}