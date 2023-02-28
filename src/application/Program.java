package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        var ch  = new ChessMatch();
        UI.printBoard(ch.getPieces());


    }
}
