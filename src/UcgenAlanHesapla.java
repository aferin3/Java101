import java.util.Scanner;

public class UcgenAlanHesapla {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3,u;

        double alan;

        Scanner tara = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz: ");
        kenar1 = tara.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        kenar2 = tara.nextInt();
        System.out.print("3. Kenarı Giriniz: ");
        kenar3 = tara.nextInt();

        u = (kenar1 + kenar2 + kenar3)/2;

        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin Alanı = "+alan);

        




    }

}
