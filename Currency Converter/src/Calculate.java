import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        double usdRate = 83.35;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = sc.nextDouble();
        double inr = amount/usdRate;
        System.out.println(inr);
    }
}
