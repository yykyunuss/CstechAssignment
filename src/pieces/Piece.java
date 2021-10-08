package pieces;

import utils.Color;
import utils.Location;

public abstract class Piece {
    Color color; // Color of piece
    Location location; // Location of piece
    double point; // Point of piece
    boolean isThreatened; // Flag that a piece is threatened or not

    public Piece(Color color, Location location, double point, boolean isThreatened) {
        this.color = color;
        this.location = location;
        this.point = point;
        this.isThreatened = isThreatened;
    }

    public Location getLocation() {
        return location;
    }

    public Color getColor() {
        return color;
    }

    public double getPoint() {
        return point;
    }

    /**
     * Sets the piece's point to half
     */
    public void setPoint() {
        if (!this.isThreatened)
            this.point = this.point / 2;
    }

    /**
     * Abstract method for calculation of piece points
     */
    public abstract void calculateThreats(Piece piece, Piece[][] board);
}
