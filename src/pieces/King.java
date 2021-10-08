package pieces;

import utils.Color;
import utils.Location;
import utils.NeighbourSquares;

import java.util.List;

public class King extends Piece {
    NeighbourSquares neighbourSquares;

    public King(Color color, Location location) {
        super(color, location, 100, false);
        neighbourSquares = new NeighbourSquares();
    }

    /**
     * This method calculates the point of opposing color pieces threatened by the king which
     * passed as a parameter.
     * Method includes 8 if blocks. Every block checks one neighbour square
     * which the king can move in the board.
     */
    public void calculateThreats(Piece piece, Piece[][] board) {
        Location north = neighbourSquares.north(piece);
        Location east = neighbourSquares.east(piece);
        Location west = neighbourSquares.west(piece);
        Location south = neighbourSquares.south(piece);
        Location northWest = neighbourSquares.northWest(piece);
        Location northEast = neighbourSquares.northEast(piece);
        Location southWest = neighbourSquares.southWest(piece);
        Location southEast = neighbourSquares.southEast(piece);

        if (north.isLegalIndex() && board[north.getX()][north.getY()] != null
                && board[north.getX()][north.getY()].getColor() != piece.getColor()) {
            // Sets the pieces point to half
            board[north.getX()][north.getY()].setPoint();
            // Sets the pieces threatened situation is true.
            // So, we do not calculate point again for this piece
            board[north.getX()][north.getY()].isThreatened = true;
        }
        if (northWest.isLegalIndex() && board[northWest.getX()][northWest.getY()] != null
                && board[northWest.getX()][northWest.getY()].getColor() != piece.getColor()) {
            board[northWest.getX()][northWest.getY()].setPoint();
            board[northWest.getX()][northWest.getY()].isThreatened = true;
        }
        if (northEast.isLegalIndex() && board[northEast.getX()][northEast.getY()] != null
                && board[northEast.getX()][northEast.getY()].getColor() != piece.getColor()) {
            board[northEast.getX()][northEast.getY()].setPoint();
            board[northEast.getX()][northEast.getY()].isThreatened = true;
        }
        if (west.isLegalIndex() && board[west.getX()][west.getY()] != null
                && board[west.getX()][west.getY()].getColor() != piece.getColor()) {
            board[west.getX()][west.getY()].setPoint();
            board[west.getX()][west.getY()].isThreatened = true;
        }
        if (east.isLegalIndex() && board[east.getX()][east.getY()] != null
                && board[east.getX()][east.getY()].getColor() != piece.getColor()) {
            board[east.getX()][east.getY()].setPoint();
            board[east.getX()][east.getY()].isThreatened = true;
        }
        if (south.isLegalIndex() && board[south.getX()][south.getY()] != null
                && board[south.getX()][south.getY()].getColor() != piece.getColor()) {
            board[south.getX()][south.getY()].setPoint();
            board[south.getX()][south.getY()].isThreatened = true;
        }
        if (southWest.isLegalIndex() && board[southWest.getX()][southWest.getY()] != null
                && board[southWest.getX()][southWest.getY()].getColor() != piece.getColor()) {
            board[southWest.getX()][southWest.getY()].setPoint();
            board[southWest.getX()][southWest.getY()].isThreatened = true;
        }
        if (southEast.isLegalIndex() && board[southEast.getX()][southEast.getY()] != null
                && board[southEast.getX()][southEast.getY()].getColor() != piece.getColor()) {
            board[southEast.getX()][southEast.getY()].setPoint();
            board[southEast.getX()][southEast.getY()].isThreatened = true;
        }
    }
}