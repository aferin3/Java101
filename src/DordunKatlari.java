import java.util.Scanner;

public class DordunKatlari {
    public static void main(String[] args) {
        int sayi = 0,total=0;
        while (sayi % 2 == 0) {
            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen bir sayı giriniz: ");

            sayi = input.nextInt();

            if(sayi%4==0){
                total+=sayi;
                
            }
            System.out.println(total);

        }
    }

}
