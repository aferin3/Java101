import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç elemanlı olsun: ");

        n = scanner.nextInt();

        int[] sayilar = new int[n];
        sayilar[0]=0;
        sayilar[1]=1;
        for(int i=0;i<n-2;i++){
            sayilar[i+2]=sayilar[i]+sayilar[i+1];

        }
        System.out.print(n+" elemanlı fibonacci serisi: ");
        for(int i:sayilar){
            System.out.print(i+" ");
        }
    }
}
