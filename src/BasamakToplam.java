import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        int sayi,kalan=0,sonuc=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        
        
        while(sayi>=10){ 
            kalan=sayi%10; 
            sayi-=kalan;  
            sonuc+=kalan; 
            sayi/=10;  
        }
        System.out.println("Sonuç: "+(sonuc+sayi) );
    }
}
