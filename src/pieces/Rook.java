package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Rook extends Piece {

    public Rook(Color color, Location location) {
        super(color, location, 5, false);
    }

    /**
     * This method calculates the point of opposing color pieces threatened by the rook which
     *   passed as a parameter.
     *   Method includes 4 for loops. Every loop checks one straight direction which the rook can move.
     */
    public void calculateThreats(Piece piece, Piece[][] board) {

        // North direction
        for (int i = piece.getLocation().getY() - 1; i >= 0; i--) {
            Piece p2 = board[piece.getLocation().getX()][i];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    // Sets the pieces point to half
                    board[piece.getLocation().getX()][i].setPoint();
                    // Sets the pieces threatened situation is true.
                    // So, we do not calculate point again for this piece
                    board[piece.getLocation().getX()][i].isThreatened = true;
                }
                break;
            }
        }

        // South direction
        for (int i = piece.getLocation().getY() + 1; i < 8; i++) {
            Piece p2 = board[piece.getLocation().getX()][i];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    board[piece.getLocation().getX()][i].setPoint();
                    board[piece.getLocation().getX()][i].isThreatened = true;
                }
                break;
            }
        }

        // East direction
        for (int i = piece.getLocation().getX() + 1; i < 8; i++) {
            Piece p2 = board[i][piece.getLocation().getY()];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    board[i][piece.getLocation().getY()].setPoint();
                    board[i][piece.getLocation().getY()].isThreatened = true;
                }
                break;
            }
        }

        // West direction
        for (int i = piece.getLocation().getX() - 1; i >= 0; i--) {
            Piece p2 = board[i][piece.getLocation().getY()];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    board[i][piece.getLocation().getY()].setPoint();
                    board[i][piece.getLocation().getY()].isThreatened = true;
                }
                break;
            }
        }
    }
}