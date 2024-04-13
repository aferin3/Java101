import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        
        double sonuc=0,sayi=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        sayi = scanner.nextDouble();
        for(int i=1; i<=sayi;i++){
            sonuc+=(1.0/i);
        }
        System.out.println("Sonuç: "+ sonuc);


    }
}
