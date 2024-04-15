import java.util.Scanner;

public class App {

    static boolean isPrime(int number, int divider) {

        if (number <= 1)
            return false;
        else if (number == 2)
            return true;
        else if (number % divider == 0)
            return false;
        else if (number == divider+1)
            return true;
        else
            return isPrime(number, divider + 1);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isPrime(sayi, 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }

    }
}
