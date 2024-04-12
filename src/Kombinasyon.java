import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int n, r,sonuc=1,bolum=1;

        Scanner data = new Scanner(System.in);

        System.out.print("Küme kaç elemanlı: ");
        n = data.nextInt();
        System.out.print("Kaç elemanlı gruplar oluşturulacak: ");
        r = data.nextInt();

        if (n >= r) {
            for (int i = 0; i < r; i++) {
                sonuc*=(n-i);
                bolum*=(i+1);
            }
            sonuc = sonuc/bolum;
           
            
            System.out.println(sonuc +" farklı şekilde gruplandırılabilir.");
        } else {
            System.out.println("hatalı giriş yaptınız.");
        }

    }
}
