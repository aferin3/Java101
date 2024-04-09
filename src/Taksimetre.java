import java.text.DecimalFormat;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double yol,tutar,hesap;

        Scanner tara = new Scanner(System.in);
        System.out.print("Kaç km gidilecek = ");
        yol = tara.nextDouble();
        hesap = 10+yol*2.20;
        tutar = hesap<20 ? 20 : hesap;
     


        System.out.println("Toplam Tutar = "+ new DecimalFormat("#.##").format(tutar));
    }
}
