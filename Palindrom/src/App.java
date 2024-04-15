import java.util.Scanner;

public class App {

    static boolean isPalindrom(int number) {

        int temp = number, reversenumber = 0, lastnumber;

        while (temp != 0) {
            lastnumber = temp % 10;
            reversenumber= (reversenumber*10) +lastnumber;
            temp/=10;
        }
        if (number == reversenumber) return true;
        else return false;

        
    }

    public static void main(String[] args) throws Exception {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        num = scanner.nextInt();

        if(isPalindrom(num)) System.out.println(num+" palindrom bir sayıdır.");
        else System.out.println(num+" palindrom değildir.");

    }
}
