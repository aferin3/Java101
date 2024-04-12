import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir yıl giriniz : ");

        yil = input.nextInt();

        if(yil%100==0 && yil%400==0 || yil%100!=0 && yil%4==0) System.out.println(yil+" bir artık yıldır!");
        else if (yil<0) System.out.println("Hatalı giriş yaptınız!");
        else System.out.println(yil+" bir artık yıl değildir!");
    }
}
