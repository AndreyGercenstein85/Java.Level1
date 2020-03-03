package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '_';
    private static  Scanner in = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {

        System.out.println("Введите размер поля");
        int size = in.nextInt();
        char[][] map = new char[size][size];
        initMap(map);
        while (true) {
            userStep(map);
            if (checkWin(DOT_X, map)) {
                System.out.println("Победа пользователя");
                printMap(map);
                break;
            }
            if(isMapFull(map)){
                System.out.println("Ничья");
                printMap(map);
                break;}
            pcTurn(map);
            printMap(map);
            if (checkWin(DOT_O, map)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull(map)) {
                break;
            }
        }
    }

    public static void userStep(char[][] map) {
        int x;
        int y;
        do {
            System.out.println("Введите номер ячеек: ");
            printMap(map);
            x = in.nextInt();
            y = in.nextInt();
            x--;
            y--;
        } while (!isCellValid(y, x, map));
        map[x][y] = DOT_X;
    }


    private static void pcTurn(char[][] map) {
        //Находим выигрышный ход компьютера
        for (int i = 0; i < map.length; i++)
            for (int j = 0; j < map.length; j++) {
                if (isCellValid(i, j, map)) {
                    map[i][j] =  DOT_O;
                    if (checkWin(DOT_O, map)) return;
                    map[i][j] =  DOT_EMPTY;
                }
            }
        //Блокировка хода пользователя, если он побеждает на следующем ходу
        for (int i = 0; i < map.length; i++)
            for (int j = 0; j < map.length; j++) {
                if (isCellValid(i, j, map)) {
                    map[i][j] =  DOT_X;
                    if (checkWin(DOT_X, map)) {
                        map[i][j] =  DOT_O;
                        return;
                    }
                    map[i][j] =  DOT_EMPTY;
                }
            }
        //Если ничего выигышного нет, то проставляем рандомно
        int x;
        int y;
        do {
            x = random.nextInt(map.length);
            y = random.nextInt(map.length);
        } while (!isCellValid(y, x, map));
        map[x][y] =  DOT_O;
    }


    private static boolean isMapFull(char[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    private static boolean checkWin(char DOT, char[][] map) {
        for (int i = 0; i < map.length; i++) {
            //проверяем строки
            if (checkLine(i, 0, 0, 1, map, DOT)) return true;
            if (checkLine(0, i, 1, 0, map, DOT)) return true;
        }

            if (checkLine(0, 0, 1, 1, map, DOT)) return true;
            if (checkLine(0, map.length - 1, 1, -1, map, DOT)) return true;

        return false;
    }

    private static boolean checkLine(int start_x, int start_y, int dx, int dy,  char[][] map, char dotX) {
        for (int i = 0; i < map.length; i++)
        {
            if (map[start_x + i * dx][start_y + i * dy] != dotX)
                return false;
        }
        return true;
    }


    public static boolean isCellValid(int y, int x, char[][] map) {
    if (x < 0 || y < 0 || x > map.length - 1 || y > map.length - 1) {
        return false;
     }
    return map[y][x] == DOT_EMPTY;
    }

    private static void initMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private  static void printMap(char [][] map) {
        System.out.println();
        System.out.print(String.format("%3s", " "));
        for (int i = 0; i < map.length; i++) {
            System.out.print((i+1) + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print("|" + map[i][j]);
            }
            System.out.println("|");

        }
    }

}