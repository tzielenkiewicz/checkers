public class Main {

    public static void main(String[] args) {
        char[][] board = new char[8][8];
        for(int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    board[i][j] = '#';
                    if (i < 3) board[i][j+1] = 'O';
                    else if (i > 4) board[i][j+1] = '*';
                    else board[i][j+1] = ' ';
                }
            }
            else    {
                for (int j = 1; j < 8; j += 2) {
                    board[i][j] = '#';
                    if (i < 3) board[i][j-1] = 'O';
                    else if (i > 4) board[i][j-1] = '*';
                    else board[i][j-1] = ' ';
                }
            }
        }

        displayBoard(board);

        char currentPlayer = 'O';
        switchPlayer(currentPlayer);

        System.out.println();
        System.out.println("Hello " + currentPlayer + ", it is time for your move!");
    }

    private static void switchPlayer(char currentPlayer) {
        if (currentPlayer != 'O') currentPlayer = 'O';
        else currentPlayer = '*';
    }

    public static void displayBoard(char[][] board) {
        System.out.println();
        System.out.println("   A   B   C   D   E   F   G   H");
        for (int i = 0; i < 8; i++) {
            System.out.println(i+1 +"| " + board[0][i] + " | " + board[1][i] + " | " + board[2][i] + " | " + board[3][i]
                    + " | " + board[4][i] + " | " + board[5][i] + " | " + board[6][i] + " | " + board[7][i] + " |");
            System.out.println("  -------------------------------");
        }
    }
}
