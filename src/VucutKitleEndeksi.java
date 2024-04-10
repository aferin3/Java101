import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        int kilo;
        double boy,indeks;
        Scanner tara = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = tara.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = tara.nextInt();

        indeks = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : "+indeks);
    }

}
