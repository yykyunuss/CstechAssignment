package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Bishop extends Piece {

    public Bishop(Color pieceColor, Location location) {
        super(pieceColor, location,3, false);
    }

    @Override
    public void calculateThreats(Piece p, Piece[][] board) {

        int j=p.getLocation().getY()-1;
        for(int i=p.getLocation().getX()-1; i>=0; i--){
            if(j<0)
                break;
            Piece p2 = board[i][j];
            if(p2!=null){

                if(p.getColor()!=p2.getColor()){
                    System.out.println("FIL NW ");
                    p2.setPoint();
                    p2.isThreatened=true;
                }
                break;
            }
            j--;
        }

        j=p.getLocation().getY()-1;
        for(int i=p.getLocation().getX()+1; i<8; i++){
            if(j<0)
                break;
            Piece p2 = board[i][j];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    System.out.println("FIL NE");
                    p2.setPoint();
                    p2.isThreatened=true;
                }
                break;
            }
            j--;
        }


        j=p.getLocation().getY()+1;
        for(int i=p.getLocation().getX()-1; i>=0; i--){
            if(j>7)
                break;
            Piece p2 = board[i][j];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){

                    p2.setPoint();
                    p2.isThreatened=true;
                }
                break;
            }
            j++;
        }

        j=p.getLocation().getY()+1;
        for(int i=p.getLocation().getX()+1; i<8; i++){
            if(j>7)
                break;
            Piece p2 = board[i][j];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    System.out.println("girdii 2");
                    p2.setPoint();
                    p2.isThreatened=true;
                }
                break;
            }
            j++;
        }

    }
}