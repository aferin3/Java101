import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int basamak;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        basamak = scanner.nextInt();

        for (int i=basamak;i>0;i--){
            for(int j=2*i-1; j>0 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
