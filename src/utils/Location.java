package utils;

public class Location {
    int x;
    int y;
    public boolean isLegal=true;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isLegalIndex(){
        if(this.x<0 || this.x>7 || this.y<0 || this.y>7)
            return false;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x && y == location.y;
    }

    @Override
    public String toString() {
        return "utils.Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
