import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        int sayi;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        System.out.println("Dizi: "+Arrays.toString(dizi));
        Arrays.sort(dizi);
        
        int buyuk=0,kucuk=0;
        
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]>sayi){
                buyuk = dizi[i];
                kucuk = dizi[i-1];
                break;
            }
            
        }
        System.out.println("Girilen Sayı: "+sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+ kucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+buyuk);
        
        
    }
}
