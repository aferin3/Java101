
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    Scanner scanner = new Scanner(System.in);
    String[][] arrMap;
    String[][] arrGame;
    boolean boom = false;
    boolean win = false;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    void checkStart(int row, int col) {

        if (row < 2 || col < 2) {

            System.out.println("Yanlış değerler girdiniz. Girdiğiniz sayılar 1'den büyük olmalıdır.\nTekrar Giriniz");

            System.out.print("Satır Sayısı: ");
            row = scanner.nextInt();
            System.out.print("Sütun Sayısı: ");
            col = scanner.nextInt();
            checkStart(row, col);
        } else {
            this.rowNumber = row;
            this.colNumber = col;
        }

    }

    void multiArrayPrint(String[][] mArr) {
        System.out.println("===============================================");
        for (String[] i : mArr) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("===============================================");
    }

    void dashfield(String[][] arr) {

        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                arr[i][j] = "-";
            }
        }

    }

    boolean isWin(String[][] arr) {
        

        for (String[] i : arr) {
            for (String j : i) {
                if (j.equals("-")) {
                    return false;

                }
            }
        }
        return true;

    }

    void checkField(String[][] field, String[][] map, int xcor, int ycor) {
        int mineN = 0;

        if (map[xcor][ycor].equals("*")) {
            
            this.boom = true;

        } else if (isWin(arrMap)) {
            
            this.win = true;

        } else {
            int[] env = { xcor - 1, xcor, xcor + 1, ycor - 1, ycor, ycor + 1 };

            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 6; j++) {
                    if (env[i] < 0 || env[j] < 0 || env[i] == map.length || env[j] == map[0].length)
                        continue;
                    else if (map[env[i]][env[j]].equals("*"))
                        mineN++;

                }
            }

            field[xcor][ycor] = String.valueOf((mineN));
            map[xcor][ycor] = String.valueOf((mineN));

        }

    }

    void run() {
        checkStart(this.rowNumber, this.colNumber);
        arrMap = new String[this.rowNumber][this.colNumber];
        arrGame = new String[this.rowNumber][this.colNumber];

        int mineNumber = this.rowNumber * this.colNumber / 4;

        Random rand = new Random();
        dashfield(this.arrGame);
        dashfield(this.arrMap);
        int mine = 0;
        while (mine < mineNumber) {
            int row = rand.nextInt(this.rowNumber);
            int col = rand.nextInt(this.colNumber);
            if (!arrMap[row][col].equals("*")) {
                arrMap[row][col] = "*";
                mine++;
            }

        }

        int xcoor = 0, ycoor = 0;
        //multiArrayPrint(arrMap);
        
        multiArrayPrint(arrGame);

        while (!this.boom && !win) {
            if (!isWin(arrMap)) {
                System.out.print("Satır Giriniz: ");
                xcoor = scanner.nextInt();
                System.out.print("Sütun Giriniz: ");
                ycoor = scanner.nextInt();
            }
            if (xcoor > this.rowNumber - 1 || ycoor > this.colNumber - 1) {
                System.out.println("Yanlış bir koordinat girdiniz. Tekrar deneyin");
            } else {
                checkField(arrGame, arrMap, xcoor, ycoor);
                if (!boom && !win) {
                    //multiArrayPrint(arrMap);
                    
                    
                    multiArrayPrint(arrGame);
                }else if(win){
                    multiArrayPrint(arrMap);
                    System.out.println(
                    "***********************************Tebirkler oyunu kazandınız.*****************************************");
                    
                }else if(boom){
                    multiArrayPrint(arrMap);
                    System.out.println(
                    "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Game over!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            }

        }

    }

}
