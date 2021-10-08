package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Knight extends Piece {

    public Knight(Color color, Location location) {
        super(color, location, 3, false);
    }

    /**
     * This method calculates the point of opposing color pieces threatened by the knight which
     * passed as a parameter.
     * Knight's move is like L move. Knight can move 8 L directions. So, we have 8 if blocks.
     */
    public void calculateThreats(Piece piece, Piece[][] board) {
        Location one = new Location(piece.getLocation().getX() + 1, piece.getLocation().getY() - 2);
        Location two = new Location(piece.getLocation().getX() + 2, piece.getLocation().getY() - 1);
        Location three = new Location(piece.getLocation().getX() + 2, piece.getLocation().getY() + 1);
        Location four = new Location(piece.getLocation().getX() + 1, piece.getLocation().getY() + 2);
        Location five = new Location(piece.getLocation().getX() - 1, piece.getLocation().getY() + 2);
        Location six = new Location(piece.getLocation().getX() - 2, piece.getLocation().getY() + 1);
        Location seven = new Location(piece.getLocation().getX() - 2, piece.getLocation().getY() - 1);
        Location eight = new Location(piece.getLocation().getX() - 1, piece.getLocation().getY() - 2);

        if (one.isLegalIndex() && board[one.getX()][one.getY()] != null && board[one.getX()][one.getY()].getColor() != piece.getColor()) {
            // Sets the pieces point to half
            board[one.getX()][one.getY()].setPoint();
            // Sets the pieces threatened situation is true.
            // So, we do not calculate point again for this piece
            board[one.getX()][one.getY()].isThreatened = true;
        }
        if (two.isLegalIndex() && board[two.getX()][two.getY()] != null && board[two.getX()][two.getY()].getColor() != piece.getColor()) {
            board[two.getX()][two.getY()].setPoint();
            board[two.getX()][two.getY()].isThreatened = true;
        }
        if (three.isLegalIndex() && board[three.getX()][three.getY()] != null && board[three.getX()][three.getY()].getColor() != piece.getColor()) {
            board[three.getX()][three.getY()].setPoint();
            board[three.getX()][three.getY()].isThreatened = true;
        }
        if (four.isLegalIndex() && board[four.getX()][four.getY()] != null && board[four.getX()][four.getY()].getColor() != piece.getColor()) {
            board[four.getX()][four.getY()].setPoint();
            board[four.getX()][four.getY()].isThreatened = true;
        }
        if (five.isLegalIndex() && board[five.getX()][five.getY()] != null && board[five.getX()][five.getY()].getColor() != piece.getColor()) {
            board[five.getX()][five.getY()].setPoint();
            board[five.getX()][five.getY()].isThreatened = true;
        }
        if (six.isLegalIndex() && board[six.getX()][six.getY()] != null && board[six.getX()][six.getY()].getColor() != piece.getColor()) {
            board[six.getX()][six.getY()].setPoint();
            board[six.getX()][six.getY()].isThreatened = true;
        }
        if (seven.isLegalIndex() && board[seven.getX()][seven.getY()] != null && board[seven.getX()][seven.getY()].getColor() != piece.getColor()) {
            board[seven.getX()][seven.getY()].setPoint();
            board[seven.getX()][seven.getY()].isThreatened = true;
        }
        if (eight.isLegalIndex() && board[eight.getX()][eight.getY()] != null && board[eight.getX()][eight.getY()].getColor() != piece.getColor()) {
            board[eight.getX()][eight.getY()].setPoint();
            board[eight.getX()][eight.getY()].isThreatened = true;
        }
    }
}