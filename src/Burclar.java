import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        int ay,gun;
        String burc="boş";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz ayı giriniz: ");
        ay = input.nextInt();
        System.out.print("Doğdunuz günü giriniz: ");
        gun = input.nextInt();

        
        if(ay==1 && gun<=21 && gun>0) burc = "Oğlak";
        else if(ay==1 && gun<=31 && gun>21) burc = "Kova";
        else if(ay==2 && gun<=19 && gun>0)  burc = "Kova";
        else if(ay==2 && gun<=29 && gun>19) burc = "Balık";
        else if(ay==3 && gun<=20 && gun>0)  burc = "Balık";
        else if(ay==3 && gun<=31 && gun>21) burc = "Koç";
        else if(ay==4 && gun<=20 && gun>0) burc = "Koç";
        else if(ay==4 && gun<=30 && gun>20) burc = "Boğa";
        else if(ay==5 && gun<=21 && gun>0) burc = "Boğa";
        else if(ay==5 && gun<=31 && gun>21) burc = "İkizler";
        else if(ay==6 && gun<=22 && gun>0) burc = "İkizler";
        else if(ay==6 && gun<=30 && gun>22) burc = "Yengeç";
        else if(ay==7 && gun<=22 && gun>0) burc = "Yengeç";
        else if(ay==7 && gun<=31 && gun>22) burc = "Aslan";
        else if(ay==8 && gun<=22 && gun>0) burc = "Aslan";
        else if(ay==8 && gun<=31 && gun>22) burc = "Başak";
        else if(ay==9 && gun<=22 && gun>0) burc = "Başak";
        else if(ay==9 && gun<=30 && gun>22) burc = "Terazi";
        else if(ay==10 && gun<=22 && gun>0) burc = "Terazi";
        else if(ay==10 && gun<=31 && gun>22) burc = "Akrep";
        else if(ay==11 && gun<=21 && gun>0) burc = "Akrep";
        else if(ay==11 && gun<=30 && gun>21) burc = "Yay";
        else if(ay==12 && gun<=21 && gun>0) burc = "Yay";
        else if(ay==12 && gun<=31 && gun>21) burc = "Oğlak";
        

        if(burc.equals("boş")) System.out.println("Yanlış tarih girdiniz.");
        else System.out.println("Burcunuz: "+ burc);


    }
}
