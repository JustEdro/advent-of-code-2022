package me.edro.d17;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class D17T1 {

    public static void main(String[] args) {
        // >>><<><>><<<>><>>><<<>>><<<><<<>><>><<>>
        //String weather = ">>><<><>><<<>><>>><<<>>><<<><<<>><>><<>>";
        String weather = ">><>>><<<>>><<>>>><<<>>>><<><>>><<<<>><<<><<<>><<<<>><<>>>><<>><<<><>><><<<>><<<<>>>><<>>><><<>>><<><<<<>>><<>>><>><<<<>><<<<>><<><<>>>><<<>>><<>>>><<<><><><<>>>><<>><<>><>>><<<>><<>>><<<<>>><><<<><<<<><<<<><<<<>>>><>>>><<<>>>><>>><>>><<<<>>><<<<><<<<>>><>>>><<>>>><<<<>>>><<<><<><<<>>>><>>><<<<>>><<<><<>>><<<<>>>><<<>><>><>><<<<>>>><><>>>><<<<>>>><<><<<<><<<<>>>><<>>><<>><<<><<<><<<<>>><<<>>><<>>>><<<>>>><>>>><<<>><<<>>><<<<>>><<>>><<<<>><<>>>><><<<<>>><><>><>><<<>>><<<>><>>>><<<<>>><<<<>>><<<<>><<<<>>><<>>>><>>>><<<>>><<<<><<<>><><<<<>>>><<<>><<<<>>>><<>><<<><<<<><<<<>>>><<<>>>><<>><><<<>><<>>>><<<>><<<>>>><>>>><><<<<><><<>>><<<>><<>>>><<<>><<>>>><<>>><<<<><<<><<>><<<>><>><<<>>>><><>>>><<<><>>>><<<>>>><<>><<>><<<<><<<>>><<<>><<<<>>><>><<>>><<<<>>>><<<><<><<>><<<<>>><<><<<<>>><>>><<>>><<>><<><><<>>>><<><<<<>>><<<<>>><<<<>>>><<>>>><>><<<<>><<<<>>><>><<<>>>><<><<<>>>><<>>><<>><<<<>><<<><<<<>>><<><<<<>>>><<>>><<<>>>><<<>><<<>>>><>>>><>>><>>><>>><>>><<>>><<><<<<>><<>><<>><>>>><<<<>>><<><<>>>><<<><<>>><<><<<>>><<>><>><<><<<>>><<>>>><<<<>><<><<>><>>>><><<<<>>>><<><<><<>><<<<>><<<><<>>>><<<<>>><>><<>>><>><<<<>><<>>><><<<>>><<<>>>><>>><<<>>><><<<><<<><<<>><>>>><<><<>>><<<<>>>><<>>><<>>>><<<<>>><<>><<<<>><<<<>>><><<><<<>><<>>><><>>>><<<><>>>><<>>>><<<>>><<>><>>>><>><<>>>><<<<>><<<>><<>><>>><<<<>>>><><<<<>>><<<<>>><>>><<<<>>>><>>><<<<>>>><><<>>><<><<<>>><<<>>><>>><<>>>><><<<<>><<>>>><<>>>><<>>><<>><<><>>>><<>>>><<<<>>><<<<><<<<><<>>><<<>><<<>>>><<><<<<>>>><<<<>>>><<<>>><><<<>>><<<>><<<>><<<<>>><<>>><<>><<<>>>><<<<>><><><<<>>>><<<>>><<>>>><<>>>><<<><><<<>>>><<<>>><>><<<>>>><<<<><<<<>>>><<<>>><<>><>>><<>><>>>><<>>><<>><<<>>><><<<>><<<>><><><<<<><<<<><<<<>><>>>><<>>><>><<<>>>><<>><<<>>><<>><<<>>><>>><<<>>>><>><<>><<<>><>><<>>>><>>>><<<><<<<>><>>>><>>>><>>><<<><<>>>><<>>>><<<<><<>>>><<<<><<>>>><<>>><<>><<<>><<>>><><<<<><>>>><>>><<<>><<<<><>>><<<<>>><>>>><><<>>>><<<<>>>><>><>>>><<<<><<<<>>>><>>>><<<>>><><<><<>>>><<<>><<<<><<<<>>><<>>><<<<>>>><<<<>><><<>>><>><<<>>><<>><<>>><><<>><<<<>>>><<<><<<<>>>><<><<<>>>><<<<><<>>>><>>>><<<<>>>><>>>><<<>><><<<>><<<<><<<>><>>><<<<>><<<<>>><<>><>>><><<<<>>><<><<<<>>>><>>><>><<<<><<<>>><>><<<>><<<><<>><>><<<<>>><<<>>><><>>>><><>><<<>>><<><<>>>><<<>>>><><>>><<<><<>><><<<><<>>>><<<>><<><>><<<>><<<<>>><<>>><<>><<<>><><<>>><<>>>><<<>><>><<>>>><<<>>>><<>>><<>>>><<>>><>><>><<<>>><<>>>><>><<>>>><<<<>><<<><<<<>><>>><<>>><<<<><<<>><><<<<>><<><<<>><<<>><>>>><<><>><<<<>>>><>>>><<><><<<<>>>><<<>>>><<<>><<><<<<>>>><<<<>><<<>>>><<<<>>>><<>><<<<>>>><>>><<><<<>>>><<>>><>>>><>><>><>><<>>>><<<><>><<<>>>><<<<>>>><<<<><<<>><><<><<>>>><<<<>><<<<>><><<<<>>>><<<<>><><<>>>><<>><<>>>><<><<><<<><<>>><<><<<><<><<<>>>><<<<>>><><<<<><<>>>><>><<<>>>><<>>><<>>><>>><>>>><<<>>><<>><<>>>><<<>>>><<<<>><<<>><<<><<<><><<<<>>><<>>><<<>><<>>>><><<<<>><<<<>>>><<<<>>><<<<><<>><<>>><<<<><<<><<<<>><<<>><<<><<<>><<<>><<<<>>>><<<>>><>>><<<<>><<<>><<<>>><>>>><<<<>><<<<><<><>><>><<><<<>>>><<<<><<>>><><<<<>><<<>>>><<<<>>><<>>>><<>>>><<<>>><<>>>><<>><>>><<><<<<>>><<<<>><<<<>><<<<>>><<<<><<><><<<><>><<<<>><<<>>>><<<<>>>><<<<>>><<><<><>><<>><<><<<<><<><>><>><<<>><<>>><>>>><<<><<<>><<<>>>><<>>><<>>>><<<<>>><<<<>><<<<>>>><<>><>>><><>><<<<>>>><<<>><<>>><<<>>>><>>>><<<<>>><<>>>><<<><<<<>>>><<><>>>><<<>>>><<><<<<>><<<<>><<><<<<>>>><<<>>>><<<<>><<>><>><<><<>>>><<>>>><<><<>><<<<>>><<<<>>>><>>><<<><>>>><<<>><<<>>><<>>><<<<>>>><><<<<>><>><<>>><<<>>>><<<<>><><>><<<<><<<<>>><<<<>>>><<<>>><<<<>>>><<>>>><<<><<>>><<>>><<<><>><>>>><<<<>>><<<<>>>><<<>><<>>><>>>><<<<>>><<>>>><<<>>>><<<><<<<>><>>><<><><<<>><<<>>><<><<<<>>>><<<<><<<<><<<>>>><<<<><<>><<<<>><<>>>><>><<<<><>>><<<><<<><<>>>><>><<<><<<<><<>>>><<>><<<<>>>><<>><<<<>><<<>><<><>>><>><<><<>>><<><<<<>><><<>>><<<>>><>>><<>>><<<><<<>>>><<<<>>><<<<>>>><<<<>>><<<<>>><<<>>>><<<>><<>><<<<>>>><<<<><<>>>><<>>><<<><<><<>>><<<<>>><<<<><<<>>><>>><<<>>>><>>><<>>><<>>>><>>><<<>>><<<><<<<>><<><<<>>><<<>>><<>>>><<><<>>><<><<<<>>>><<<>><<<<>>><<<<>>><>>>><><<<>><<<<>>>><>><<<>>><<>>>><<<<><<<>>><<<>>><><>>>><>><<<>>><<<<><<<>><<<<>>>><<<<><><<>><><>><<<><<<<><<<>>><<>>>><<<>>><<>>><<>>><<>>><<<>>>><<><<>>>><<<<>>>><<<>><<<><<<<>>><<>>>><<<<>>>><<><<>>><<>><<<>>>><<<>>>><>><<<<>>>><>>>><>>><<<<>><<<<>>><<<><<<>>><<<>><<<>><<<><>>><>><<<<>><<<<>>>><<>><<>><<<>>>><<<>><<<<>>><<>>>><<<<><><<<>>><>>><<<<>>><<>>><<<<>><<<>>><<<<>><>>>><<>>><><<<>>>><<<<>>>><>><<<>>>><<<>>>><>><>>><<<>>>><><>>>><<<<><>>><<<>><<<<>>><<<>>><<><<>>>><<<><<<><<<>>><<<><>><>>><><<<<>>><<<<>>><>>>><<<<>>>><>>><<<>>><>>><>>><<<><<><<><<<<><<<<>>>><<<>>>><<<>>>><<<<><<<><<>>>><>>>><<<>><<<>>><<>><<<<><><>><<><<<>>><<<<>>>><><<><<<>><>>>><<<<>>>><<>>><<<<><<<>>>><<>>><<<<>>>><<<<>><<>>><<<>>>><<<<>><<<><<>><>><<>><>><<>>><<>>>><<<<>><<><<<><<<<>><<<<>><>>><><<<<>><<>><<<<>><<<>>><><<<><<<>>><<><<<<>><<<<>>><<><<>><><<<<><<<>><<<><<<<>>><<<<><<>>><<<>>><<<>><<<<><<>>>><<<<>>><<<<>>><<<<><>>>><<><>><>>><<>>>><><<<><><>>><<<<><<><<<>>><>>><><<<><<>><>>><<<<>><<<>>><<>>>><<>>>><>>>><<<>>><>><<<<>><<<>>><<<>>>><>>><<><<><<<<>>>><<<><>>>><<>>>><<<>>>><<>>>><>><<<<>>>><<><<<<>>>><<>><<<>>>><>><<><<<<>><>>>><<<<>><<>>><<<<>><<<<>>><<<<>>><<>><<<<><><<<>>>><<>>>><<<>>><<<><<<>>><<<>>><<>>><><<<>>><<>><<>>>><><<<<>>><<<>><<><<>>>><<<><<><<<<>><><><<>>>><<<<>>><<<<>><<><<><>>>><<<>>><<<>>>><<<>>><<<<>>>><<<<>>><<<<><<><<<<>>><>>><<<<><>>><>>>><<>>><<>>>><<<<>>><<<>>><<<<><<>>>><>>><<<>>><<<<><><<>>><<<>>><<<>><<<>>>><<<><<>>>><<>>><>><<<>>>><<>>><<>><<<>>>><<><<<<>>>><<>>>><<<<><<>>><<>><>>>><<<>>><<<><<<><<<>>>><<>>>><<>>>><<<<>>><><<<>>>><<<<>><<>>>><><>><<<>><<<<>><>>>><><<<>>>><>><<<<>>><<<<>><<<>><<>>>><>>><<<>>>><>>>><>>>><<>><<<<>>>><<><<<<>>>><><<><>><<<>>><>>>><<>>><<<>><<<>>>><<><<<<><<<>>>><<<<>><<>><<>><<>>>><>>><<<>>><<<><<<<>>>><>>><>><<>>>><>>>><<<<>><<<>>>><<<>><<<<>>><<>><<><<>>>><>><>>><><<>><<><<><<<>>><<<>><>><<<<>>><<<<>>>><<<<><>>>><<>>>><<<<>><<<<>><<<>>>><>><<<>>><<<<>>>><<<<>>><<<><><<><<<<>><<<<><<>><<<<>>>><>><>>>><<<>><<>><<<<>>><<<<><<<><>><>>>><>><>>><<>>>><<<<>><<>>>><<<<>>><<<>><>><<<<>>><<<<>>><<><<<<>>>><<<<>>><<<>>><>><<<><<>>>><<>><<<<>><<<>><><<<>>><<<>><<<<>>>><><<<>>>><<<<>><<<<>>>><<<<>>><<<><>>><<<<>>><>><>>><<>><<><<<>>>><><<<<>>>><<<<>>><<<<>>><<>><>><<>><<<>>><<<<>>><<>>><<<>>><<<<><>>>><>>><<<<>>><<<><>><<>>><<>><<>>>><>>><<<<>><<>><<<>><><<><>><<<<>>><<<<><<>>><>>>><<>><<<>><<>>><<>>>><<<><<<><<<<>><<<>><<>>><><>><<<><<><>>>><<<>>>><<<>>>><>><<><<<<><<<<>>>><<<>>><<><<<<>>><<<>><<>><>>><<>><<<>>>><><><<<>><>>>><<>>>><>>><<<>><>>>><<<<>><<<<><<<<>><<<<>><<<<>>>><<<<>>><<<><<<<>>>><<>>>><<<>><<>>>><<<>>><<<>>><<>><<<>><<<<><<<>><><>>><<><<>>>><<>>><>>><<<>><<><<><<<>>>><<<<><<<><<<<>><<<<><<<>><<>>><<<<>>>><<<>>>><<><<>>>><><<<>><><>>>><<<<>>><><><<<>>>><<<><<<><<>>><<>><<<>><<<>>>><<<>><<>><<<<>><<>>><><<<<><<><<>><<<>>>><<<><<<>>>><<>><<<<>><<<<><<<>>>><<<<>><<<><<<<>>>><>>>><<<><<><><<<><<<>>><<>>><<<<><<>>>><<<>>><<<<>>><<><<>><<>>>><><<<<>>>><><>>><<<>>><<>>><<<<>>>><<<<>><<<>>>><>>><<>>>><>><<<>><<<><<<<>>><>><<<>><<>>>><<><<<>><<><<<><<<<>>>><><<>>>><<<>>><<<<>><>>>><<>><>>><<<<>>><<<<><<<<>><<<<>><<<><<<<><>>>><><<<>>>><<>><<>>><><<<>>><><<<<><>><<<>>>><<><<<<>>>><<<><<<>>>><>>><<<><<<<>>>><<<<><>>><<<>>><<>><<><<<<>>><<<<>>><><>>><<<<><<>>><<>><<<><>><<<<>>><<>><<<>>><<<<>>><<<>>><<<><<<<><<<<>><<><<<>>><<>><<<>><><<<>>>><<><<>>><<<>>>><<>><<<<>>>><>>><<<<><><<<<>><>>><<<>>><<<>>><<<>><>>>><>>><<<<><<<>><>>>><<<>>><><<><>>><<<>>>><>><<<>><<<<><>><<>>><<<><>>><<<>><><<<<>>>><<<><<<>><>><<<>>><>>>><<<>>><<>>>><<<>>>><>>>><<<<>>><<><<>><<<<>>>><>>><<<><<<<>>>><<<>>><<>>><<<>><<<<>>><<<<><>>>><<>>>><<>>><<>><<<<>><<<>>><<<>>>><<<<>>>><>>><><<>>>><<<>>><<><><<>>>><<<>>>><<>><<<<>><<<<>>><<<><<<><<><<<><<<>>>><<<<>>><<<<>><<<<>><<<<>>>><<<><<>><<>>>><<>>><<<<>>>><<<>>>><><>>>><<<<>>>><<<<>><<<>>><<<<>><<<>>><<<<><<<><<<<>>><<<>>><<>>>><>>>><<<<><<<<>><<>>>><<<<><>>><><<>>><>>>><<<>>>><<<<><<><<<<><><<<<><<<<>>>><<<<>>><<<>>><<<<>>>><<<<>><>>>><<>><<>><<>><<<>><>>><>><>><<><>><<<>>><<<>>><>>><<>><<<><>><<>><<<>><<<>><>>>><>>>><<<>><>>>><<>>>><>><<>>>><>><<<<>><<>>><<<<>>><<>><<<>>>><<>><<>><<<<><<<><<<<>>><>>><<>><>><<<>><<<>>><>>>><<>>>><>>><<>>>><><>><<>><<<<><<>>>><<<><<>>>><<>><<<>>>><>><<>>>><>>><><><<<><>><<><>><<<><<<<>>><<>>>><><<>>>><<>>><<>>>><<<<>>>><>>><><>><>>><><<<<>>>><<<<>>><<<<>>>><<>>>><<>>>><<<>>>><<<<>>>><<<>>><<<>>>><<<<><<<>>><<<<><<>>><<>>>><<<<>><>>>><<><><<<<><<<>>><<<>><<><<<<>>>><<>><><<<>>>><<<>>><<<<>>><>>><<<<>>>><<<<>>><<><<>>>><<<><>>>><<<<>>><>><>>>><<<<>><<>>>><>><<<>><<>>><<<<><<<>>><<<><>>><<<><><<<>>><<<>>>><><>>><<<><<<<>>><>>><>><<<><<<<>>><>>>><<<<>>><<<<>>><<<>><<>>><<<<>>>><<>><<<<>><>>><<<>><>><<<<><<<<>><<<><<<>>>><><>><<>>>><<<<><<<>>>><<<<>><<>>><<<><>>>><<<<><><>>>><<>>><<<>>><<<<>>>><<>>><><<<>>><<>>>><<<<>>><<<<>><><<<<>>>><<<<>><<<><<><<<<>>><<<<><<>><<<>>><<<>>><><>>><<<>>><<>><<<>>><<<<>><>>><>>>><>>><<<<>>><>>><<><<<<>>>><<<<>>><<<<>>>><<<>>><>>><>><<<>>>><>>><<<<>>>><<<<>>><<<<>>>><<<>><<<>><<>><>><<<<>>><>>>><<<<>><<<<><<<<>>><>><>><<<>>>><<<><>>><<><<<<>>>><<<<>><<<<>>>><<<>><<<><<<>>>><<<<><<<>><><<<<>>>><<>>>><<<<>>><<>>><>>><<><<<<><<<><<><<<<>>><>>>><<<<><<<<>>>><<<<>>><<>>>><<>>>><>>>><<><<<<><>><<>>>><<<>>><<<<>><<>>><<<>>>><<<>><<<<>><<<><>>><><<<>>><<<>>><<<><<>><<<>><<<>>>><<>><<>>><<<>><>>>><<>>><<<<><><<<>>><<>>><>><<<<>>><<<>>><<>><<<<><<>>><<>>>><<>><>>><<<<><<<<><<<><<<<>>><<>>><<<<>>><<>>>><>>>><<<<>>>><<<>><<<>><<<><>><>>>><<<><<<>>><>>><<<><<>>>><>>>><>>><><<<>>>><<<>>><>><<>>>><<>>><<>>>><<<<>>>><<>>>><<>>><<<>><<<<>>><><<<>>><<<><<<><<<>>>><>>>><><<>>>><<<>><><<<<>>>><<<<>>><<<<>><>><>>>><<<><><>>><<<>>><<<>>>><<>>>><<<<>>><><<>>>><>>><<><<<>>>><<<>>>><<<>>>><>>><>>>><>>><>>><>>><<<<><>>><<<>>><>><<<>>><>>>><<<<>>><<>>>><<><<>>><<><<<<>>><<>>><<><<<<>>><<>><<>>>><<<>>>><<<><><<<<><<<><<><>><<<<>><<>><<<<>><<>>>><<<>>>><<<<>>>><>>>><<<<>><<<>>>><<>>>><<><<>>><<<<><>>>><<<>>>><<<<><<<<>><>>><<<>>><<<<><>><<<><<>>><<>>>><<<><<<>><<<>>><<<>>><<<<>>><<<<>>>><<<>>>><<<><<<<>><<<<>>><<<>><<<>>><>>><<>><>>>><>>>><<<>>><<<>>>><<>>><<<><><<<>>>><<<><<<<>>><<<>>>><><<>>><<>>><<<>>><<<<>>><<<>>>><<<>>>><>>>><<<><<><>>>><<>>>><<<<>><<<><<<<>>><>";

        List<char[][]> figures = new ArrayList<>();
        figures.add(
                new char[][]{
                        new char[]{'#', '#', '#', '#'}
                }
        );
        figures.add(
                new char[][]{
                        new char[]{'.', '#', '.'},
                        new char[]{'#', '#', '#'},
                        new char[]{'.', '#', '.'},
                }
        );
        figures.add(
                new char[][]{
                        new char[]{'#', '#', '#'},
                        new char[]{'.', '.', '#'},
                        new char[]{'.', '.', '#'},
                }
        );
        figures.add(
                new char[][]{
                        new char[]{'#'},
                        new char[]{'#'},
                        new char[]{'#'},
                        new char[]{'#'},
                }
        );
        figures.add(
                new char[][]{
                        new char[]{'#', '#'},
                        new char[]{'#', '#'},
                }
        );

        char[][] map = new char[10000][7];

        int firstEmpty = 1;
        int figureNum = 0;
        int weatherPos = 0;
        map[0] = new char[]{'#', '#', '#', '#', '#', '#', '#'};

        do {
            int figure = figureNum++ % figures.size();
            int x = 2;
            int y = firstEmpty + 3;
            char[][] figureModel = figures.get(figure);

            while (true) {
                // shift
                char w = weather.charAt(weatherPos++ % weather.length());
                int shift = w == '<' ? -1 : 1;
                if (!collision(map, x + shift, y, figureModel)) {
                    x += shift;
                }

                // fall
                boolean shifted = false;
                if (!collision(map, x, y - 1, figureModel)) {
                    shifted = true;
                    y--;
                }

                if (!shifted) {
                    firstEmpty = max(persist(map, x, y, figureModel), firstEmpty);
                    break;
                }
            }

            if (figureNum <= 10 || figureNum > 2020) {
                System.out.println("Fig num: " + figureNum);
                printMap(map, firstEmpty);
            }
        } while (figureNum < 2022);

        System.out.println(figureNum + ": " + (firstEmpty-1));
    }

    private static boolean collision(char[][] map, int x, int y, char[][] figureModel) {
        if (x < 0 || x + figureModel[0].length > 7) {
            return true;
        }

        boolean collision = false;
        for (int i = 0; i < figureModel.length; i++) {
            for (int j = 0; j < figureModel[0].length; j++) {
                if (figureModel[i][j] == '#') {
                    if (map[y + i][x + j] == '#') {
                        collision = true;
                        break;
                    }
                }
            }
            if (collision) {
                break;
            }
        }
        return collision;
    }

    private static int persist(char[][] map, int x, int y, char[][] figureModel) {
        for (int i = 0; i < figureModel.length; i++) {
            for (int j = 0; j < figureModel[0].length; j++) {
                if (figureModel[i][j] == '#') {
                    map[y + i][x + j] = '#';
                }
            }
        }

        return y + figureModel.length;
    }

    private static void printMap(char[][] map, int top) {
        for (int i = 0; i < min(top + 1, 15); i++) {
            System.out.print((top - i) + ": ");
            for (int j = 0; j < map[0].length; j++) {
                char a = map[top - i][j];
                System.out.print(a == '#' ? '#' : '.');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
}
