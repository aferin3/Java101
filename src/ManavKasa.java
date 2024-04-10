import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutF = 2.14, elmaF = 3.67, domatesF = 1.11, muzF = 0.95, patlicanF = 5, toplam;
        int armut, elma, domates, muz, patlican;
        
        Scanner tara = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut = tara.nextInt();
         System.out.print("Elma Kaç Kilo ? : ");
        elma = tara.nextInt();
         System.out.print("Domates Kaç Kilo ? : ");
        domates = tara.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muz = tara.nextInt();
         System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = tara.nextInt();

        toplam = armut*armutF + elma*elmaF + domates*domatesF+ patlican*patlicanF +muz*muzF;
         System.out.print("Toplam Tutar : "+ toplam);
         
    }

}
