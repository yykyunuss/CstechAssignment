package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Bishop extends Piece {

    public Bishop(Color pieceColor, Location location) {
        super(pieceColor, location,3);
    }

    @Override
    public double calculateThreats(Piece p, Piece[][] board) {
        double threatPoint=0;
        int j=p.getLocation().getY()-1;
        for(int i=p.getLocation().getX()-1; i>=0; i--){
            if(j<0)
                break;
            Piece p2 = board[i][j--];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    threatPoint+=p2.getPoint()/2;
                }
                break;
            }
        }

        j=p.getLocation().getY()-1;
        for(int i=p.getLocation().getX()+1; i<8; i++){
            if(j<0)
                break;
            Piece p2 = board[i][j--];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    threatPoint+=p2.getPoint()/2;
                }
                break;
            }
        }


        j=p.getLocation().getY()+1;
        for(int i=p.getLocation().getX()-1; i>=0; i--){
            if(j>7)
                break;
            Piece p2 = board[i][j++];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    threatPoint+=p2.getPoint()/2;
                }
                break;
            }
        }

        j=p.getLocation().getY()+1;
        for(int i=p.getLocation().getX()+1; i<8; i++){
            if(j>7)
                break;
            Piece p2 = board[i][j++];
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