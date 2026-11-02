public class CtoFTableDisplay {

    public static void main(String[] args) {
        System.out.printf("%12s %12s%n", "Celsius", "Fahrenheit");

        for (int celsius = -100; celsius <= 100; celsius++) {
            System.out.printf("%12.1f %12.1f%n",
                    (double) celsius, CtoF(celsius));
        }
    }

    public static double CtoF(double Celsius) {
        return Celsius * 9.0 / 5.0 + 32;
    }
}