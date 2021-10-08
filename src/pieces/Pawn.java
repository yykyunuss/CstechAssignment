package pieces;

import utils.Color;
import utils.Location;
import utils.NeighbourSquares;

public class Pawn extends Piece {
    NeighbourSquares neighbourSquares;
    public Pawn(Color pieceColor, Location location) {
        super(pieceColor, location, 1, false);
        neighbourSquares = new NeighbourSquares();
    }

    @Override
    public void calculateThreats(Piece p, Piece[][] board) {
        if(p.getColor()==Color.WHITE){
            Location northWest = neighbourSquares.northWest(p);
            Location northEast = neighbourSquares.northEast(p);

            if(northWest.isLegalIndex() && board[northWest.getX()][northWest.getY()] != null
                    && board[northWest.getX()][northWest.getY()].getColor() == Color.BLACK ){
                System.out.println("north westt");
                board[northWest.getX()][northWest.getY()].setPoint();
                board[northWest.getX()][northWest.getY()].isThreatened=true;
            }
            if(northEast.isLegalIndex() && board[northEast.getX()][northEast.getY()] != null
                    && board[northEast.getX()][northEast.getY()].getColor() == Color.BLACK){
                System.out.println("!!!!!!!!!!!!");
                board[northEast.getX()][northEast.getY()].setPoint();
                board[northEast.getX()][northEast.getY()].isThreatened=true;
            }
        }

        if(p.getColor()==Color.BLACK){
            Location southWest = neighbourSquares.southWest(p);
            Location southEast = neighbourSquares.southEast(p);

            System.out.println("psss: " + southWest.getX() + ",,  " + southWest.getY());
            if(southWest.isLegalIndex() && board[southWest.getX()][southWest.getY()] != null
                    && board[southWest.getX()][southWest.getY()].getColor() == Color.WHITE ){
                System.out.println("south westt");
                board[southWest.getX()][southWest.getY()].setPoint();
                board[southWest.getX()][southWest.getY()].isThreatened=true;
            }
            if(southEast.isLegalIndex() && board[southEast.getX()][southEast.getY()] != null
                    && board[southEast.getX()][southEast.getY()].getColor() == Color.WHITE){
                System.out.println("south eastt");
                board[southEast.getX()][southEast.getY()].setPoint();
                board[southEast.getX()][southEast.getY()].isThreatened=true;
            }
        }

        /*for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j] != null && p.getColor()==Color.WHITE && board[i][j].getColor()==Color.BLACK){
                    if(neighbourSquares.northWest(p).equals(board[i][j].getLocation())
                            || neighbourSquares.northEast(p).equals(board[i][j].getLocation())){
                        if(!board[i][j].isThreatened) {
                            threatPoint += board[i][j].getPoint() / 2;
                            board[i][j].isThreatened=true;
                        }
                    }
                }
                else if(board[i][j] != null && p.getColor()==Color.BLACK && board[i][j].getColor()==Color.WHITE){
                    if(neighbourSquares.southWest(p).equals(board[i][j].getLocation())
                            || neighbourSquares.southEast(p).equals(board[i][j].getLocation())){
                        if(!board[i][j].isThreatened) {
                            threatPoint += board[i][j].getPoint() / 2;
                            board[i][j].isThreatened=true;
                        }
                    }
                }
            }
        }*/

    }
}
