package utils;

import pieces.Piece;

public class NeighbourSquares {
    public NeighbourSquares() {
    }

    /**
     * Eight method in below finds piece's neighbour square's locations in the board.
     */
    public Location north(Piece p) {
        return new Location(p.getLocation().getX(), p.getLocation().getY() - 1);
    }

    public Location south(Piece p) {
        return new Location(p.getLocation().getX(), p.getLocation().getY() + 1);
    }

    public Location west(Piece p) {
        return new Location(p.getLocation().getX() - 1, p.getLocation().getY());
    }

    public Location east(Piece p) {
        return new Location(p.getLocation().getX() + 1, p.getLocation().getY());
    }

    public Location northWest(Piece p) {
        return new Location(p.getLocation().getX() - 1, p.getLocation().getY() - 1);
    }

    public Location northEast(Piece p) {
        return new Location(p.getLocation().getX() + 1, p.getLocation().getY() - 1);
    }

    public Location southWest(Piece p) {
        return new Location(p.getLocation().getX() - 1, p.getLocation().getY() + 1);
    }

    public Location southEast(Piece p) {
        return new Location(p.getLocation().getX() + 1, p.getLocation().getY() + 1);
    }
}
