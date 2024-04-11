import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, pass, yeni1, yeni2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        pass = input.nextLine();

        if (userName.equals("patika") && pass.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        } else if (userName.equals("patika")) {
            System.out.print("Şifreniz hatalı! Sıfırlamak istermisiniz? \n 1-Evet 2-Hayır :");
            select = input.nextInt();

            switch (select) {
                case 1:
                    Scanner tara = new Scanner(System.in);
                    System.out.print("Yeni şifreniz: ");
                    yeni1 = tara.nextLine();
                    System.out.print("Tekrar giriniz: ");
                    yeni2 = tara.nextLine();
                    if (yeni1.equals(yeni2)) {
                        if (yeni1.equals("java123")) {
                            System.out.println("Şifre oluşturalmadı. Lütfen başka şifre giriniz.");
                        } else {
                            System.out.println("Şifre Oluştruldu.");
                        }
                    } else {
                        System.out.println("Şifreler uyuşmadı tekrar deneyiniz.");
                    }
                    break;
                case 2:
                    System.out.println("Şifre oluşturulmadı!");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız");
            }
        } else {
            System.out.println("Bilgileriniz Yanlış");
        }

    }
}
