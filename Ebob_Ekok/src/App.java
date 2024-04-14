import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n1,n2,x;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        n1=input.nextInt();
        System.out.print("İkinci sayı: ");
        n2=input.nextInt();

        x = n1<n2 ? n1 : n2;
        
        while(x>0){
            if(n1%x==0 && n2%x==0){
                System.out.println("Ebob = "+x+" Ekok = "+(n1*n2)/x);
                break;
            }
            x--;

        }

        
        
    }
}
