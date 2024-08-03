package currency_convo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Currency {

    public static boolean isValidShortForm(String shortForm) {
        String shortFormRegex = "^[A-Z]{3}$";
        Pattern pattern = Pattern.compile(shortFormRegex);
        return pattern.matcher(shortForm).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        currencyRate currencyRate = new currencyRate();
        calculation calculation = new calculation(scanner);

        System.out.println("\t\t\t*** Currency Converter *** \n");
        while (true) {
            try {
                System.out.print("Enter amount and short form of currency separated by a space\n(e.g., '123 INR'):");
                String input = scanner.nextLine().trim();
                String[] parts = input.split(" ");
                double number = Double.parseDouble(parts[0]);
                String shortForm = parts[1];
                if (parts.length == 2 && isValidShortForm(shortForm)) {
                    if (shortForm.equals("INR")) {
                        System.out.println("USD");
                        System.out.println("JPY");
                        System.out.println("EUR");
                        System.out.println("RUB");
                        System.out.println("Exit");
                    } else if (shortForm.equals("USD")) {
                        System.out.println("INR");
                        System.out.println("JPY");
                        System.out.println("EUR");
                        System.out.println("RUB");
                        System.out.println("Exit");
                    } else if (shortForm.equals("JPY")) {
                        System.out.println("INR");
                        System.out.println("USD");
                        System.out.println("EUR");
                        System.out.println("RUB");
                        System.out.println("Exit");
                    } else if (shortForm.equals("EUR")) {
                        System.out.println("INR");
                        System.out.println("USD");
                        System.out.println("JPY");
                        System.out.println("RUB");
                        System.out.println("Exit");
                    } else if (shortForm.equals("RUB")) {
                        System.out.println("INR");
                        System.out.println("USD");
                        System.out.println("JPY");
                        System.out.println("EUR");
                        System.out.println("Exit");
                    } else {
                        System.out.println("Invalid");
                        break;
                    }
                    System.out.print("In which you want to convert: ");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "INR":
                            double inr = calculation.Other_to_India(shortForm,number);
                            System.out.println(inr + " INR");
                            break;
                        case "USD":
                            double usd = calculation.Other_to_America(shortForm, number);
                            System.out.println(usd + " USD");
                            break;
                        case "JPY":
                            double jpy = calculation.Other_to_japan(shortForm, number);
                            System.out.println(jpy + " JPY");
                            break;
                        case "EUR":
                            double eur = calculation.Other_to_Europe(shortForm, number);
                            System.out.println(eur + " EUR");
                            break;
                        case "RUB":
                            double rub = calculation.Other_to_Russia(shortForm, number);
                            System.out.println(rub + " RUB");
                            break;
                        case "Exit":
                            Exit();
                            return;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                } else {
                    System.out.println("Invalid input.\nPlease enter a number and a short form of a word separated by a space (e.g., '123 INR'):");
                }
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("Please Enter Valid Format !!");
                System.out.println();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void Exit() {
        System.out.println("Thank you..");
    }
}

