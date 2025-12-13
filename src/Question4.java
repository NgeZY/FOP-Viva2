import java.util.Scanner;

public class Question4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char[][] board = new char[3][3];

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter row " + (i + 1) + ": ");
                String row = sc.next();
                for (int j = 0; j < 3; j++) {
                    board[i][j] = row.charAt(j);
                }
            }
            int xCount = countMoves(board, 'X');
            int oCount = countMoves(board, 'O');

            if (xCount == oCount || xCount == oCount + 1) {
                // 3. 如果棋局有效，调用 checkWinner 判断赢家
                char winner = checkWinner(board);

                if (winner != '.') {
                    System.out.println("Winner: " + winner);
                } else {
                    System.out.println("No winner");
                }
            } else {
                System.out.println("Invalid board: number of moves is not valid.");
            }
        }


        public static char checkWinner(char[][] board) {
            // A. 检查行 (Rows)
            for (int i = 0; i < 3; i++) {
                if (board[i][0] != '.' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                    return board[i][0];
                }
            }
            for (int j = 0; j < 3; j++) {
                if (board[0][j] != '.' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                    return board[0][j];
                }
            }
            if (board[0][0] != '.' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return board[0][0];
            }

            if (board[0][2] != '.' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return board[0][2];
            }


            return '.';
        }

        public static int countMoves(char[][] board, char player) {
            int count = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == player) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

