import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total = 0;
        boolean moreItems;

        do {
            double price = SafeInput.getRangedDouble(
                    in, "Enter item price", 0.50, 10.00);

            total += price;

            moreItems = SafeInput.getYNConfirm(
                    in, "Do you have another item?");
        } while (moreItems);

        System.out.printf("%nTotal cost: $%.2f%n", total);
    }
}
