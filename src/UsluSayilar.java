import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int taban,us,sonuc=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        taban = input.nextInt();
        System.out.print("üssünü giriniz: ");
        us = input.nextInt();

        for(int i = 0;i<us;i++){
            sonuc*=taban;
        }
        System.out.println("Sonuç: "+ sonuc);

    }
}
