import java.util.Scanner;

public class App {

    static void usAlma(){
        int us, taban,result=1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        taban = scanner.nextInt();
        System.out.print("Taban değeri giriniz: ");
        us = scanner.nextInt();
        
        for(int i=1;i<=us;i++){
            result*=taban;
        }
        System.out.println("Sonuç: "+ result);
        usAlma();
        

    }
    public static void main(String[] args) throws Exception {

        usAlma();
        

    }
}
