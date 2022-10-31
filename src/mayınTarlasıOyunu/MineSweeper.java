package mayınTarlasıOyunu;
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String [][] mineMap;
    String [][] gameMap;
    int mineNumber;
    boolean isTrue = true;
    int r;
    int c;
    int count =0;


    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.gameMap = new String[rowNumber][colNumber];
        this.mineMap = new String[rowNumber][colNumber];
        this.mineNumber = (rowNumber*colNumber)/4;
    }

   void mineMap(){
        for(int i = 0; i<rowNumber; i++){
            for(int j =0; j <colNumber; j++){
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }
    void randomNumber(){
        Random random = new Random();
        for(int i=0; i<this.mineNumber; i++){
            int random1 = random.nextInt(this.rowNumber);
            int random2 = random.nextInt(this.colNumber);
            if(!this.mineMap[random1][random2].equals("*")){
                this.mineMap[random1][random2]="*";
            }
        }
    }
    void printMineMap(){
        System.out.println("Mayınların Konumu");
        randomNumber();
        for(int i = 0; i<this.rowNumber; i++){
            for(int j = 0; j<this.colNumber; j++){
                if(!this.mineMap[i][j].equals("*")){
                    this.mineMap[i][j]="-";
                }
                System.out.print(this.mineMap[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("========================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz");

    }
    void printGameMap(){
        for(int i = 0; i<this.rowNumber; i++){
            for(int j =0; j<this.colNumber; j++){
                this.gameMap[i][j]="-";
                System.out.print(this.gameMap[i][j]+" ");
            }
            System.out.println();
        }
    }
    void select(){
        Scanner scanner = new Scanner(System.in);
        isTrue = false;
        while(!isTrue){
            System.out.print("Satır : ");
            r = scanner.nextInt();
            System.out.print("Sütun : ");
            c = scanner.nextInt();
            if (r >= rowNumber || c >= colNumber) {
                System.out.println("Map sinirlari disinda secim yaptınız tekrar giriniz !");
                continue;
            }
            if (mineMap[r][c].equals("*")) {
                System.out.println("Game Over!");
                break;
            }
            control();
            if (isFinish()) {

                System.out.println("Tebrikler kazandınız !");
                break;
            }
        }

    }
    void control() {
        count = 0;
        for (int i = (r - 1); i <= (r + 1); i++) {
            for (int j = (c - 1); j <= (c + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.colNumber) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[r][c] = String.valueOf(count);
        this.mineMap[r][c] = String.valueOf(count);
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }
    boolean isFinish(){
        //eğer bombaya bastıysa
        for(int i = 0; i< this.rowNumber; i++){
            for(int j  = 0; j<this.colNumber; j++){
                if(this.mineMap[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    void run(){
        mineMap();
        printMineMap();
        select();
    }

}
