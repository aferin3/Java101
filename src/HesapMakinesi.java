import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1,n2;
        int select;

        Scanner tara = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = tara.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = tara.nextDouble();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz : ");
        select = tara.nextInt();

        switch(select){
            case 1:
                System.out.println("Sonuç = "+ (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç = "+ (n1-n2));
                break;
        
            case 3:
                System.out.println("Sonuç = "+ (n1*n2));
                break;
            case 4:
                System.out.println("Sonuç = "+ (n1/n2));
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız");
        
            }

    }
}
