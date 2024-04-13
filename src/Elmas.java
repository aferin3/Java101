import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        int n,m;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        System.out.print(" ");
        for(int y=1;y<2*n-4;y++){
            System.out.print("*");
        }
        System.out.println();
        
         for(int i=1;i<n;i++){
            for(int k=1;k<i;k++){

                System.out.print(" ");
            }
            
            for(int j=1;j<2*n-2*i;j++){
                System.out.print("*");
                

            }
            System.out.println();

        }
    }
}