import java.util.Scanner;

public class KuvvetYazdir {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz: ");

        sayi = input.nextInt();
        int j = 1;
        for(int i=1;i<=sayi;i*=4){

            System.out.println("Dördün Kuvveti: "+i);


        }

        for(int i=1;i<=sayi;i*=5){

            System.out.println("Beşin Kuvveti: "+i);


        }

    }

}
