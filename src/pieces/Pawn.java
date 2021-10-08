package pieces;

import utils.Color;
import utils.Location;
import utils.NeighbourSquares;

public class Pawn extends Piece {
    NeighbourSquares neighbourSquares;

    public Pawn(Color color, Location location) {
        super(color, location, 1, false);
        neighbourSquares = new NeighbourSquares();
    }

    /**
     * This method calculates the point of opposing color pieces threatened by the pawn which
     * passed as a parameter.
     * Method checks cross-forward two squares which pawn can move in the board.
     * Cross-forward squares directions differ for white and black pawns.
     * So, we have two if block for white and black situation.
     */
    public void calculateThreats(Piece piece, Piece[][] board) {
        if (piece.getColor() == Color.WHITE) {
            Location northWest = neighbourSquares.northWest(piece);
            Location northEast = neighbourSquares.northEast(piece);

            if (northWest.isLegalIndex() && board[northWest.getX()][northWest.getY()] != null
                    && board[northWest.getX()][northWest.getY()].getColor() == Color.BLACK) {
                // Sets the pieces point to half
                board[northWest.getX()][northWest.getY()].setPoint();
                // Sets the pieces threatened situation is true.
                // So, we do not calculate point again for this piece
                board[northWest.getX()][northWest.getY()].isThreatened = true;
            }
            if (northEast.isLegalIndex() && board[northEast.getX()][northEast.getY()] != null
                    && board[northEast.getX()][northEast.getY()].getColor() == Color.BLACK) {
                board[northEast.getX()][northEast.getY()].setPoint();
                board[northEast.getX()][northEast.getY()].isThreatened = true;
            }
        }

        if (piece.getColor() == Color.BLACK) {
            Location southWest = neighbourSquares.southWest(piece);
            Location southEast = neighbourSquares.southEast(piece);

            if (southWest.isLegalIndex() && board[southWest.getX()][southWest.getY()] != null
                    && board[southWest.getX()][southWest.getY()].getColor() == Color.WHITE) {
                board[southWest.getX()][southWest.getY()].setPoint();
                board[southWest.getX()][southWest.getY()].isThreatened = true;
            }
            if (southEast.isLegalIndex() && board[southEast.getX()][southEast.getY()] != null
                    && board[southEast.getX()][southEast.getY()].getColor() == Color.WHITE) {
                board[southEast.getX()][southEast.getY()].setPoint();
                board[southEast.getX()][southEast.getY()].isThreatened = true;
            }
        }
    }
}
