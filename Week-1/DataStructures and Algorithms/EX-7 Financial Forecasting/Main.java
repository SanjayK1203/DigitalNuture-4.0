import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double initialValue = sc.nextDouble();

        System.out.print("Enter annual growth rate: ");
        double growthRate = sc.nextDouble()/100;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        Finance calc = new Finance(initialValue, growthRate, years);
        double result = calc.calculateFutureValue();

        System.out.printf("\nPredicted value after %d years: ₹%.2f\n", years, result);       // to limit the decimal points
    }
}