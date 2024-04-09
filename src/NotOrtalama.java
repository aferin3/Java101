import java.util.Scanner;


public class NotOrtalama {
    public static void main(String[] args) throws Exception {
      int matematik,fizik,kimya,turkce,tarih,muzik;

      System.out.print("Matematik: ");
      Scanner tara = new Scanner(System.in);
      matematik = tara.nextInt();
      System.out.print("Fizik:  ");
      fizik = tara.nextInt();
      System.out.print("Kimya: ");
      kimya = tara.nextInt();
      System.out.print("Turkce: ");
      turkce = tara.nextInt();
      System.out.print("Tarih: ");
      tarih = tara.nextInt();
      System.out.print("Muzik: ");
      muzik = tara.nextInt();
      float ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6f;
      boolean durum = ortalama>=60;
      String gecme = durum ? "Geçtiniz": "Kaldınız";

      System.out.println("notunuz "+ortalama+" "+ gecme);



    }
}
