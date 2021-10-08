package pieces;

import utils.Color;
import utils.Location;

public class Bishop extends Piece {

    public Bishop(Color color, Location location) {
        super(color, location, 3, false);
    }

    /**
     * This method calculates the point of opposing color pieces threatened by the bishop which
     * passed as a parameter.
     * Method includes 4 for loops. Every loop checks one diagonal direction which the bishop can move.
     */
    public void calculateThreats(Piece piece, Piece[][] board) {

        // North-west direction
        int j = piece.getLocation().getY() - 1;
        for (int i = piece.getLocation().getX() - 1; i >= 0; i--) {
            if (j < 0)
                break;
            Piece p2 = board[i][j];
            if (p2 != null) {
                if (piece.getColor() != p2.getColor()) {
                    // Sets the pieces point to half
                    p2.setPoint();
                    // Sets the pieces threatened situation is true.
                    // So, we do not calculate point again for this piece
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