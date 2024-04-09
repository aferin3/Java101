import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
 
        Scanner tara = new Scanner(System.in);

        System.out.print("Lütfen KDV'siz Tutarı Girin: ");

        double anapara, kdv, total;

        anapara = tara.nextDouble();

        kdv = anapara>1000 ? anapara*8/100: anapara*18/100;

        total = kdv + anapara;

        System.out.println("KDV\'siz Fiyat = "+ anapara +"\nKDV\'li Fiyat = "+ total +"\nKDV Tutarı = "+ kdv);


    }
}
