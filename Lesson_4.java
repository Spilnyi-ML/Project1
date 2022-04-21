package com.homeproject.firstproject;

import java.util.Random;
import java.util.Scanner;

public class Lesson_4 {

    Random random;
    Scanner scanner;
    char[][] table;

    Lesson_4(){
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }


    public static void main(String[] args){
        new Lesson_4().game();
    }

    void game(){
        System.out.println("Game is started!");
        initTable();
        printTable();

        while(true){
            turnHuman();
            if(checkWin('x')){
                printTable();
                    System.out.println("YOU WON!");
                    break;
        }
            if(isTableFull()){
                System.out.println("DRAW!");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                printTable();
                System.out.println("AI WON!");
                break;
            }
        }

}

    boolean isTableFull() {
        for(int x = 0; x < 3; x++){
            for(int y =0; y < 3; y++){
                if(table[x][y] == '.') return false;
            }
        }
        return true;
    }


    /*    // проверить строки
            if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol) return true;
            if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol) return true;
            if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol) return true;
        // проверить столбцы
            if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
            if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
            if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;
        // проверить диагонали
            if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
            if (table[0][2] == symbol && table[1][1] == symbol && table[2][0] == symbol) return true;
    */
    boolean checkWin(char symbol) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][0] == symbol && table[i][1] == symbol && table[i][2] == symbol ||
                        table[0][j] == symbol && table[1][j] == symbol && table[2][j] == symbol ||
                        table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol ||
                        table[2][0] == symbol && table[1][1] == symbol && table[0][2] == symbol
                ) {
                    return true;
                }
                return false;
            }
            return false;
        } return false;
    }

    void turnHuman(){
        int x, y;

      /*  do{
            System.out.println("Enter x y from [0..2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
            //System.out.println(x + ", " + y);
        }   while (!isCellValid(x, y));
      */
        System.out.println("Enter x y from [0..2]");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if(isCellValid(x, y)) table[x][y] = 'x';
        else turnHuman();

    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }

    void turnAI(){
        int x, y;

        x = random.nextInt(3);
        y = random.nextInt(3);
        if(isCellValid(x, y)) table[x][y] = 'o';
        else turnAI();

    }


    void initTable(){
        for(int x = 0; x < 3; x++){
            for(int y =0; y < 3; y++){
                table[x][y] = '.';
            }
        }

    }

    void printTable(){
        for(int y = 0; y < 3; y++){
            for(int x =0; x < 3; x++){
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

}
