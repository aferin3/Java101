import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int miktar, buyuk, kucuk;
        Scanner data = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");

        miktar = data.nextInt();

        int[] sayilar = new int[miktar];

        for (int i = 0; i < miktar; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            sayilar[i] = data.nextInt();

        }
        buyuk = sayilar[0];
        kucuk = sayilar[0];

        for (int i : sayilar) {
            buyuk = i > buyuk ? i : buyuk;
            kucuk = i < kucuk ? i : kucuk;
        }
        System.out.println("En Büyük Sayı: " + buyuk);
        System.out.println("En Küçük Sayı: " + kucuk);

    }
}
