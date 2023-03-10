package chess;


import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        InitialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matriz[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matriz;
    }

    private void InitialSetup(){
        board.placePiece(new Rook(board, Color.white),new Position(1,1));
        board.placePiece(new King(board, Color.white),new Position(0,4));
        board.placePiece(new King(board, Color.black),new Position(7,4));
    }
}