import java.util.Scanner;

public class BolmeveOrtalama {
    public static void main(String[] args) {
        while (true) {
            int sayi, toplam = 0, kac = 0;

            Scanner input = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");

            sayi = input.nextInt();

            for (int i = 1; i <= sayi; i++) {
                if (i % 12 == 0) {
                    toplam += i;
                    kac++;
                }

            }
            System.out.println(toplam / kac);
        }
    }

}
