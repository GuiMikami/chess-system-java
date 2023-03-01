package application;


import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        var ch  = new ChessMatch();
        UI.printBoard(ch.getPieces());


    }
}
