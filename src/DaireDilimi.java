import java.text.DecimalFormat;
import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        double r,pi=3.14,alan;
        int aci;

        Scanner tara = new Scanner(System.in);

        System.out.print("Daire diliminin yarıçapı = ");
        r=tara.nextDouble();
        System.out.print("Daire diliminin açısı = ");
        aci=tara.nextInt();

        alan = (pi*(r*r)*aci)/360;
        System.out.println("Daire Diliminin Alanı = "+ new DecimalFormat("#.##").format(alan));



    }

}
