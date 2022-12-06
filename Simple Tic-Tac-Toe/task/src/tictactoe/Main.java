package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] cells = new char[9];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = ' ';
        }

        System.out.println("---------");
        System.out.println("| " + cells[0] + " " + cells[1] + " " + cells[2] + " |");
        System.out.println("| " + cells[3] + " " + cells[4] + " " + cells[5] + " |");
        System.out.println("| " + cells[6] + " " + cells[7] + " " + cells[8] + " |");
        System.out.println("---------");

        boolean inputState = true;
        boolean gameState = false;
        int counter = 0;


        do {
            do {
                String userInput2 = scanner.nextLine().replaceAll("\\s", "");
                String substring1 = userInput2.substring(0, 1);
                String substring2 = userInput2.substring(1, 2);
                int one = Integer.parseInt(substring1);
                int two = Integer.parseInt(substring2);

                if (InputAnalyze.isInputIsNumbers(substring1, substring2) == false) {
                    inputState = false;
                    InputAnalyze.inputIsNotNumber();
                } else if (InputAnalyze.areCoordinatesInRange(one, two) == false) {
                    inputState = false;
                    InputAnalyze.coordinatesNotInRange();
                } else if (InputAnalyze.isCellOccupied(cells, userInput2) == true) {
                    inputState = false;
                } else {
                    InputAnalyze.assignPosition(cells, userInput2, counter);
                    counter++;
                    System.out.println("---------");
                    System.out.println("| " + cells[0] + " " + cells[1] + " " + cells[2] + " |");
                    System.out.println("| " + cells[3] + " " + cells[4] + " " + cells[5] + " |");
                    System.out.println("| " + cells[6] + " " + cells[7] + " " + cells[8] + " |");
                    System.out.println("---------");
                    inputState = false;
                }

                if (GameAnalyze.isXWins(cells) == true) {
                    GameAnalyze.resultXWins();
                    inputState = true;
                    gameState = true;
                } else if (GameAnalyze.isOWins(cells) == true) {
                    GameAnalyze.resultOWins();
                    inputState = true;
                    gameState = true;
                } else if (GameAnalyze.draw(cells) == true) {
                    GameAnalyze.resultDraw();
                    inputState = true;
                    gameState = true;
                }
            } while (!inputState);
        } while (!gameState);


    }
}

