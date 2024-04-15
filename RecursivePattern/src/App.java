import java.util.Scanner;

public class App {

    static void pattern(int num, int result, int y) { // 16 16
        if (result > 0) {
            System.out.print(result + " ");
            pattern(num, result - 5, y - 5);
        } else {
            if (y != num+5){
                System.out.print(y  + " ");
                pattern(num, -1, y + 5);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        N = scanner.nextInt();
        System.out.print("Çıktısı: ");
        pattern(N, N, N);

    }
}
