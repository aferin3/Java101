import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int row, col;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen satır sayısını giriniz: ");
        row = scanner.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz: ");
        col = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row, col);

        mineSweeper.run();

    }
}
