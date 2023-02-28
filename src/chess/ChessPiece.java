package chess;

import boardgame.Board;
import boardgame.Piece;
import chess.Color;

public class ChessPiece extends Piece {
    public ChessPiece(Board board) {
        super(board);
    }

    private Color color;

    public Color getColor() {
        return color;
    }
}
