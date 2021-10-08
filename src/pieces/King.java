package pieces;

import utils.Color;
import utils.Location;
import utils.NeighbourSquares;

import java.util.List;

public class King extends Piece {
    NeighbourSquares neighbourSquares;
    public King(Color pieceColor, Location location) {
        super(pieceColor, location, 100, false);
        neighbourSquares = new NeighbourSquares();
    }

    @Override
    public void calculateThreats(Piece p, Piece[][] board) {
        Location north = neighbourSquares.north(p);
        Location east = neighbourSquares.east(p);
        Location west = neighbourSquares.west(p);
        Location south = neighbourSquares.south(p);
        Location northWest = neighbourSquares.northWest(p);
        Location northEast = neighbourSquares.northEast(p);
        Location southWest = neighbourSquares.southWest(p);
        Location southEast = neighbourSquares.southEast(p);

        System.out.println("king: " + north.isLegal);
        if(north.isLegalIndex() && board[north.getX()][north.getY()] != null
                && board[north.getX()][north.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[north.getX()][north.getY()].setPoint();
            board[north.getX()][north.getY()].isThreatened=true;
        }
        if(northWest.isLegalIndex() && board[northWest.getX()][northWest.getY()] != null
                && board[northWest.getX()][northWest.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[northWest.getX()][northWest.getY()].setPoint();
            board[northWest.getX()][northWest.getY()].isThreatened=true;
        }
        if(northEast.isLegalIndex() && board[northEast.getX()][northEast.getY()] != null
                && board[northEast.getX()][northEast.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[northEast.getX()][northEast.getY()].setPoint();
            board[northEast.getX()][northEast.getY()].isThreatened=true;
        }
        if(west.isLegalIndex() && board[west.getX()][west.getY()] != null
                && board[west.getX()][west.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[west.getX()][west.getY()].setPoint();
            board[west.getX()][west.getY()].isThreatened=true;
        }
        if(east.isLegalIndex() && board[east.getX()][east.getY()] != null
                && board[east.getX()][east.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[east.getX()][east.getY()].setPoint();
            board[east.getX()][east.getY()].isThreatened=true;
        }
        if(south.isLegalIndex() && board[south.getX()][south.getY()] != null
                && board[south.getX()][south.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[south.getX()][south.getY()].setPoint();
            board[south.getX()][south.getY()].isThreatened=true;
        }
        if(southWest.isLegalIndex() && board[southWest.getX()][southWest.getY()] != null
                && board[southWest.getX()][southWest.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[southWest.getX()][southWest.getY()].setPoint();
            board[southWest.getX()][southWest.getY()].isThreatened=true;
        }
        if(southEast.isLegalIndex() && board[southEast.getX()][southEast.getY()] != null
                && board[southEast.getX()][southEast.getY()].getColor() != p.getColor())
        {
            System.out.println("birer..");
            board[southEast.getX()][southEast.getY()].setPoint();
            board[southEast.getX()][southEast.getY()].isThreatened=true;
        }
    }
}