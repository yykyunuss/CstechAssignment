package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Rook extends Piece {

    public Rook(Color pieceColor, Location location) {
        super(pieceColor, location,5);
    }

    @Override
    public double calculateThreats(Piece p, Piece[][] board) {
        double threatPoint=0;

        for(int i=p.getLocation().getY()-1; i>=0; i--){
            Piece p2 = board[p.getLocation().getX()][i];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    threatPoint+=p2.getPoint()/2;
                }
                break;
            }
        }
        for(int i=p.getLocation().getY()+1; i<8; i++){
            Piece p2 = board[p.getLocation().getX()][i];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    threatPoint+=p2.getPoint()/2;
                }
                break;
            }
        }
        for(int i=p.getLocation().getX()+1; i<8; i++){
            Piece p2 = board[i][p.getLocation().getY()];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    threatPoint+=p2.getPoint()/2;
                }
                break;
            }
        }
        for(int i=p.getLocation().getX()-1; i>=0; i--){
            Piece p2 = board[i][p.getLocation().getY()];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    threatPoint+=p2.getPoint()/2;
                }
                break;
            }
        }


        return threatPoint;
    }
}