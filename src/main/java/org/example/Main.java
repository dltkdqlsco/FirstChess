package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Position board = new Position();

        board.printBoard();

        board.moveHouse(1, 3, 2,3);
        board.printBoard();

    }
}