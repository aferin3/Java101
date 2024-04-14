import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       while(true){
        int n,x,toplam=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        n = scanner.nextInt();
        x = n;

        while(n>1){
            n--;
            if(x%n==0) toplam+=n;
        }
        if(toplam==x) System.out.println(x+" Mükemmel sayıdır.");
        else System.out.println(x+" Mükemmel sayı değildir.");
    }}
}
