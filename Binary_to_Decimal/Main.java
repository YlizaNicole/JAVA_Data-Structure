package Binary_to_Decimal;

import java.util.Scanner;

public class Main {

    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of binary numbers: " + ANSI_BLUE);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < N; i++) {
            System.out.print(ANSI_RESET + "Enter a binary number: " + ANSI_BLUE);
            String binary = scanner.nextLine();
            int decimal = 0;
            int power = 0;

            for (int j = binary.length() - 1; j >= 0; j--) {
                if (binary.charAt(j) == '1') {
                    decimal += Math.pow(2, power);
                }
                power++;
            }
            System.out.println(ANSI_RESET + "Decimal equivalent: " + ANSI_GREEN + decimal);
        }

        scanner.close();
    }
}