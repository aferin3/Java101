import java.util.Scanner;

public class HipotenusHesapla {
    public static void main(String[] args) {
        double dikKenar1, dikKenar2, hipotenus;

        Scanner tara = new Scanner(System.in);

        System.out.print("1. Dik Kenarın Uzunluğu: ");
        dikKenar1 = tara.nextInt();
        System.out.print("2. Dik Kenarın Uzunluğu: ");
        dikKenar2 = tara.nextInt();
        hipotenus = Math.sqrt(Math.pow(dikKenar1,2)+Math.pow(dikKenar2,2));
        System.out.print("Hipotenüsün Uzunluğu: "+ hipotenus);
    }

}
