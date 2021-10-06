package pieces;

import utils.Color;
import utils.Location;
import utils.NeighbourSquares;

import java.util.List;

public class Pawn extends Piece {
    NeighbourSquares neighbourSquares;
    public Pawn(Color pieceColor, Location location) {
        super(pieceColor, location, 1);
        neighbourSquares = new NeighbourSquares();
    }

    @Override
    public double calculateThreats(Piece p, Piece[][] board) {
        double threatPoint=0;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j] != null && p.getColor()==Color.WHITE && board[i][j].getColor()==Color.BLACK){
                    if(neighbourSquares.northWest(p).equals(board[i][j].getLocation())
                            || neighbourSquares.northEast(p).equals(board[i][j].getLocation())){
                        threatPoint+= board[i][j].getPoint()/2;
                    }
                }
                else if(board[i][j] != null && p.getColor()==Color.BLACK && board[i][j].getColor()==Color.WHITE){
                    if(neighbourSquares.southWest(p).equals(board[i][j].getLocation())
                            || neighbourSquares.southEast(p).equals(board[i][j].getLocation())){
                        threatPoint+=board[i][j].getPoint()/2;
                    }
                }
            }
        }
        return threatPoint;
    }
}
