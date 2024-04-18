import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static boolean isTrue;
    static int sira;

    static void tahmin(int num, int secret, int hak,int[] tahminler) {
        
        if (num == secret) {
            System.out.println("Tebrikler gizli sayıyı bildiniz. " + num);
            isTrue=true;
        }else if(num<0 || num>100){
            System.out.println("Hatalı giriş yaptınız.");
        } else if (num < secret) {
            System.out.println("Seçtiğiniz sayı gizli sayıdan küçüktür. " + num);
            isTrue = false;

        } else if (num > secret) {
            System.out.println("Girdiğiniz sayı gizli sayıdan büyüktür. " + num);
            isTrue = false;

        }
        if(!isTrue && hak>1){
            tahminler[sira-hak]=num;
            hak--;
            int i;
            System.out.print("Kalan Hakkınız: "+hak +" Tekrar Deneyiniz: ");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            tahmin(i, secret, hak,tahminler);
            
        }else if(!isTrue){
            tahminler[tahminler.length-1]=num;
            System.out.println("Maalesef bilemediniz. Gizli Sayı: "+ secret + ". Tahminleriniz: "+ Arrays.toString(tahminler));
        }

    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int sayi, gizliSayi, hakSayisi;
        
        Random rand = new Random();
        gizliSayi = rand.nextInt(100);
        System.out.print("Kaç hakkınız olsun: ");
        hakSayisi = scanner.nextInt();
        int[] tahminler= new int[hakSayisi];
        sira = hakSayisi;

        System.out.print("Tahmininiz nedir : ");
        sayi = scanner.nextInt();

        tahmin(sayi, gizliSayi, hakSayisi,tahminler);

    }
}
