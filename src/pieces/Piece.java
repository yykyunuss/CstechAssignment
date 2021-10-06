package pieces;

import utils.Color;
import utils.Location;

import java.awt.*;
import java.util.List;

public abstract class Piece {
    Color color;
    Location location;
    double point;

    public Piece(Color pieceColor, Location location, double point) {
        color = pieceColor;
        this.location = location;
        this.point = point;
    }

    /**
     * Returns which tile of the board the piece is on.
     *
     * @return The tile which the piece is on.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Returns the color of the piece.
     *
     * @return True if the piece is white; false if it is black.
     */
    public Color getColor() {
        return color;
    }

    public double getPoint() {
        return point;
    }

    public abstract double calculateThreats(Piece piece, Piece[][] board);
}
