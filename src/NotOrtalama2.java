import java.util.Scanner;

public class NotOrtalama2 {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik,ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        if(mat<0 || mat>100) mat = 0;
        if(turkce<0 || turkce>100) turkce = 0;
        if(fizik<0 || fizik>100) fizik = 0;
        if(kimya<0 || kimya>100) kimya = 0;
        if(muzik<0 || muzik>100) muzik = 0;

        ortalama = (mat+turkce+fizik+kimya+muzik)/5;

        if(ortalama>55) System.out.println("Tebrikler Sınıfı Geçtiniz");
        else System.out.println("Sınıfta Kaldınız");
        System.out.println("Ortalamanız: "+ ortalama);




    }
}
