public class App {
    public static void main(String[] args) throws Exception {
        String[][] bHarfi;
        bHarfi = new String[5][3];

        for (int i = 0; i < bHarfi.length; i++) {
            for (int j = 0; j < bHarfi[i].length; j++) {
                if (i == 0 && j == 2 || i == 4 && j == 2 || i == 2 && j == 2) {
                    bHarfi[i][j] = "   ";
                } else if (i == 0 || i == 2 || i == 4 || j == 0 || j == 2) {
                    bHarfi[i][j] = " * ";
                } else {
                    bHarfi[i][j] = "   ";
                }
            }
        }
        for (String[] row : bHarfi) {
            for (String col : row) {
                System.out.print(col);

            }
            System.out.println();
        }
    }
}
