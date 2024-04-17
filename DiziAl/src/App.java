import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int diziboyutu;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutu: ");
        
        diziboyutu = scanner.nextInt();

        int[] dizi = new int[diziboyutu];

        System.out.println("Dizinin elemanlarını giriniz:");

        for(int i=0;i<diziboyutu;i++){
            System.out.print((i+1) + ". Elemanı: ");
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);

        System.out.print("Sıralama: ");
        for(int i: dizi){
            System.out.print(i + " ");
        }
    }
}
