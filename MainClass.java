import java.util.Scanner;
import java.util.InputMismatchException;

public class MainClass {

    public static void main(String[] args) {

        AtmOperationsInterface operation = new AtmOperationImpl();

        int atmnumber = 1234;
        int atmPin = 1234;

        Scanner sc = new Scanner(System.in);

        int chances = 3;

        while (chances > 0) {

            try {

                System.out.println("Enter ATM Number: ");
                int atmNumber = sc.nextInt();

                System.out.println("Enter Pin: ");
                int Userpin = sc.nextInt();

                // Check if PIN has 4 digits
                if (String.valueOf(Userpin).length() != 4) {
                    System.out.println("Enter a 4 digit PIN");
                    chances--;
                    continue;
                }

                if ((atmnumber == atmNumber) && (atmPin == Userpin)) {

                    System.out.println("Validation Done\n");

                    while (true) {

                        System.out.println("\n1. View Balance");
                        System.out.println("2. Withdraw Amount");
                        System.out.println("3. Deposit Amount");
                        System.out.println("4. View MiniStatement");
                        System.out.println("5. Exit");

                        try {

                            System.out.println("\nEnter choice: ");
                            int choice = sc.nextInt();

                            switch (choice) {

                                case 1:
                                    operation.viewBalance();
                                    break;

                                case 2:
                                    try {
                                        System.out.println("Enter Amount to Withdraw:");
                                        double amount = sc.nextDouble();
                                        operation.withdrawAmount(amount);
                                    } catch (InputMismatchException e) {
                                        System.out.println("Invalid amount entered.");
                                        sc.nextLine();
                                    }
                                    break;

                                case 3:
                                    try {
                                        System.out.println("Enter Amount to Deposit:");
                                        double amountD = sc.nextDouble();
                                        operation.depositAmount(amountD);
                                    } catch (InputMismatchException e) {
                                        System.out.println("Invalid amount entered.");
                                        sc.nextLine();
                                    }
                                    break;

                                case 4:
                                    operation.viewMiniStatement();
                                    break;

                                case 5:
                                    System.out.println("Collect your ATM Card");
                                    System.out.println("Have a Good Day");
                                    System.exit(0);

                                default:
                                    System.out.println("Enter a valid choice.");
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid choice. Enter numbers only.");
                            sc.nextLine();
                        }
                    }

                } else {
                    chances--;
                    System.out.println("\nIncorrect ATM number or PIN. " + chances + " chances remaining");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}