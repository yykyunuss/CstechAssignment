package utils;

public class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Checks if location's x or y is out of the board. If it is, returns false.
     */
    public boolean isLegalIndex() {
        return this.x >= 0 && this.x <= 7 && this.y >= 0 && this.y <= 7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x && y == location.y;
    }
}
