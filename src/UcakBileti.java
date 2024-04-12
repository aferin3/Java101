import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int mesafe,yas,secenek;
        double indirim=0,tutar,sontutar=0;
        boolean hata = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");

        secenek = input.nextInt();
        tutar =mesafe*0.1;

        if(yas<0 || mesafe<0) hata = true;
        else if(yas <12) indirim=0.5;
        else if(yas<=24) indirim=0.1;
        else if(yas>65) indirim=0.3;

        switch(secenek){
            case 1:
                sontutar = tutar-tutar*indirim;
                break;
            case 2:
                sontutar = ((tutar-tutar*indirim)-(tutar-tutar*indirim)*0.2)*2;
                break;
            default:
                hata = true;
                
        }
        if(hata) System.out.println("Hatalı Veri Girdiniz !");
        else System.out.println("Toplam Tutar : "+ sontutar);
        
    }
}
