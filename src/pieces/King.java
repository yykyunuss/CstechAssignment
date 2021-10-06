package pieces;

import utils.Color;
import utils.Location;
import utils.NeighbourSquares;

import java.util.List;

public class King extends Piece {
    NeighbourSquares neighbourSquares;
    public King(Color pieceColor, Location location) {
        super(pieceColor, location, 100);
        neighbourSquares = new NeighbourSquares();
    }

    @Override
    public double calculateThreats(Piece p, Piece[][] board) {
        /*System.out.println("king method");
        double threatPoint=0;
        for(Piece pieceElement: boardList){
                if(neighbourSquares.northWest(p).equals(pieceElement.getLocation())
                        || neighbourSquares.northEast(p).equals(pieceElement.getLocation())
                        || neighbourSquares.southWest(p).equals(pieceElement.getLocation())
                        || neighbourSquares.southEast(p).equals(pieceElement.getLocation())
                        || neighbourSquares.south(p).equals(pieceElement.getLocation())
                        || neighbourSquares.east(p).equals(pieceElement.getLocation())
                        || neighbourSquares.west(p).equals(pieceElement.getLocation())
                        || neighbourSquares.north(p).equals(pieceElement.getLocation()))
                {
                    threatPoint+= pieceElement.getPoint()/2;
                }
        }
        //if(p.getLocation().getX()-1)
        return threatPoint;*/
        return 0;
    }
}