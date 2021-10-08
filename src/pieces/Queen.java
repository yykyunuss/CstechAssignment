package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Queen extends Piece {

    public Queen(Color color, Location location) {
        super(color, location, 9, false);
    }

    /**
     * This method calculates the point of opposing color pieces threatened by the queen which
     * passed as a parameter.
     * Method includes 8 for loops. Because queen can move to any directions.
     * Every loop checks one direction which the queen can move.
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

        // Cross moves

        // North-west direction
        int j = piece.getLocation().getY() - 1;
        for (int i = piece.getLocation().getX() - 1; i >= 0; i--) {
            if (j < 0)
                break;
            Piece p2 = board[i][j];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    p2.setPoint();
                    p2.isThreatened = true;
                }
                break;
            }
            j--;
        }

        // North-east direction
        j = piece.getLocation().getY() - 1;
        for (int i = piece.getLocation().getX() + 1; i < 8; i++) {
            if (j < 0)
                break;
            Piece p2 = board[i][j];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    p2.setPoint();
                    p2.isThreatened = true;
                }
                break;
            }
            j--;
        }

        // South-west direction
        j = piece.getLocation().getY() + 1;
        for (int i = piece.getLocation().getX() - 1; i >= 0; i--) {
            if (j > 7)
                break;
            Piece p2 = board[i][j];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    p2.setPoint();
                    p2.isThreatened = true;
                }
                break;
            }
            j++;
        }

        // South-east direction
        j = piece.getLocation().getY() + 1;
        for (int i = piece.getLocation().getX() + 1; i < 8; i++) {
            if (j > 7)
                break;
            Piece p2 = board[i][j];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    p2.setPoint();
                    p2.isThreatened = true;
                }
                break;
            }
            j++;
        }
    }
}