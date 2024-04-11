import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı 1:");
        a = input.nextInt();
        System.out.print("Sayı 2:");
        b = input.nextInt();
        System.out.print("Sayı 3:");
        c = input.nextInt();

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        if (a < b && a < c) {
            if (b < c)
                System.out.println("a<b<c");
            else
                System.out.println("a<c<b");
        } else if (b < a && b < c) {
            if (a < c)
                System.out.println("b<a<c");
            else
                System.out.println("b<c<a");
        } else {
            if (b < a)
                System.out.println("c<b<a");
            else
                System.out.println("c<a<b");
        }
    }
}
