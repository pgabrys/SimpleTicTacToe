package tictactoe;

public class InputAnalyze {

    static void coordinatesNotInRange() {
        System.out.println("Coordinates should be from 1 to 3!");
    }

    static boolean isCellOccupied(char[] cells, String userInput) {
        boolean cellIsOccupied = false;
        switch (userInput) {
            case "11":
                if (cells[0] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "12":
                if (cells[1] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "13":
                if (cells[2] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "21":
                if (cells[3] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "22":
                if (cells[4] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "23":
                if (cells[5] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "31":
                if (cells[6] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "32":
                if (cells[7] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
            case "33":
                if (cells[8] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    cellIsOccupied = true;
                }
                break;
        }
        return cellIsOccupied;
    }


    static boolean areCoordinatesInRange(int one, int two) {
        boolean inRange = false;
        if (one >= 1 && one <= 3 & two >= 1 & two <= 3) {
            inRange = true;
        }
        return inRange;
    }

    static boolean isInputIsNumbers(String substring1, String substring2) {
        boolean isIt = false;
        try {
            int one = Integer.parseInt(substring1);
            int two = Integer.parseInt(substring2);
            isIt = true;
        } catch (NumberFormatException e) {
        }
        return isIt;
    }

    static void inputIsNotNumber() {
        System.out.println("You should enter numbers!");
    }

    static char sign(int counter) {
        char sign;
        if (counter % 2 == 0) {
            sign = 'X';
        } else {
            sign = 'O';
        }
        return sign;
    }

    static void assignPosition(char[] cells, String userInput, int counter) {
        switch (userInput) {
            case "11":
                cells[0] = sign(counter);
                break;
            case "12":
                cells[1] = sign(counter);
                break;
            case "13":
                cells[2] = sign(counter);
                break;
            case "21":
                cells[3] = sign(counter);
                break;
            case "22":
                cells[4] = sign(counter);
                break;
            case "23":
                cells[5] = sign(counter);
                break;
            case "31":
                cells[6] = sign(counter);
                break;
            case "32":
                cells[7] = sign(counter);
                break;
            case "33":
                cells[8] = sign(counter);
                break;
        }
    }


}
