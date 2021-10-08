package pieces;

import utils.Color;
import utils.Location;

import java.awt.*;
import java.util.List;

public abstract class Piece {
    Color color;
    Location location;
    double point;
    boolean isThreatened;

    public Piece(Color color, Location location, double point, boolean isThreatened) {
        this.color = color;
        this.location = location;
        this.point = point;
        this.isThreatened = isThreatened;
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

    public void setPoint() {
        if(!this.isThreatened)
            this.point = this.point/2;
    }

    public abstract void calculateThreats(Piece p, Piece[][] board);
}
