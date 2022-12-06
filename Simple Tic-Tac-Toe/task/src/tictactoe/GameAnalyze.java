package tictactoe;

public class GameAnalyze {

    static boolean isXWins(char[] cells) {
        boolean xWins = false;
        for (int i = 0; i < cells.length; i++) {
            if (cells[0] == 'X' && cells[1] == 'X' && cells[2] == 'X'
                    || cells[3] == 'X' && cells[4] == 'X' & cells[5] == 'X'
                    || cells[6] == 'X' && cells[7] == 'X' & cells[8] == 'X'
                    || cells[0] == 'X' && cells[3] == 'X' & cells[6] == 'X'
                    || cells[1] == 'X' && cells[4] == 'X' & cells[7] == 'X'
                    || cells[2] == 'X' && cells[5] == 'X' & cells[8] == 'X'
                    || cells[0] == 'X' && cells[4] == 'X' & cells[8] == 'X'
                    || cells[6] == 'X' && cells[4] == 'X' & cells[2] == 'X')
                xWins = true;
        }
        return xWins;
    }

    static void resultXWins() {
        System.out.println("X wins");
    }

    static boolean isOWins(char[] cells) {
        boolean oWins = false;
        for (int i = 0; i < cells.length; i++) {
            if (cells[0] == 'O' && cells[1] == 'O' & cells[2] == 'O'
                    || cells[3] == 'O' && cells[4] == 'O' & cells[5] == 'O'
                    || cells[6] == 'O' && cells[7] == 'O' & cells[8] == 'O'
                    || cells[0] == 'O' && cells[3] == 'O' & cells[6] == 'O'
                    || cells[1] == 'O' && cells[4] == 'O' & cells[7] == 'O'
                    || cells[6] == 'O' && cells[7] == 'O' & cells[8] == 'O'
                    || cells[2] == 'O' && cells[5] == 'O' & cells[8] == 'O'
                    || cells[6] == 'O' && cells[4] == 'O' & cells[2] == 'O')
                oWins = true;
        }
        return oWins;
    }

    static void resultOWins() {
        System.out.println("O wins");
    }


    static boolean draw(char[] cells) {
        boolean draw = false;
        int countX = 0;
        int countO = 0;

        for (int a = 0; a < cells.length; a++) {
            if (cells[a] == 'X') {
                countX++;
            } else if (cells[a] == 'O') {
                countO++;
            }
        }

        if (countX + countO == 9) {
            draw = true;
        }
        return draw;
    }

    static void resultDraw() {
        System.out.println("Draw");
    }
}
