package org.example;

import java.util.Arrays;

public class ChessBoard {
    // 싱글톤을 써야하나??
    protected char[][] board;

    public ChessBoard() {
        board = new char[8][8];
        initialize();
    }
    private static ChessBoard instance = new ChessBoard();

    public static ChessBoard getInstance(){
        if (instance == null) {
            instance = new ChessBoard();
        }
        return instance;
    }

    public void initialize() {
        for (int i = 0; i < 8; i++) {
            Arrays.fill(board[i], '.');
        }
        board[0][0] = board[0][7] = 'R';
        board[0][1] = board[0][6] = 'N';
        board[0][2] = board[0][5] = 'B';
        board[0][3] = 'Q';
        board[0][4] = 'K';

        for (int i = 0; i < 8; i++) {
            board[1][i] = 'P';
            board[6][i] = 'p';
        }

        board[7][0] = board[7][7] = 'r';
        board[7][1] = board[7][6] = 'n';
        board[7][2] = board[7][5] = 'b';
        board[7][3] = 'q';
        board[7][4] = 'k';
    }

    public void printBoard() {
        System.out.print("   ");
        for(int i = 0; i < 8; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
