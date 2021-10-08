package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Queen extends Piece {

    public Queen(Color pieceColor, Location location) {
        super(pieceColor, location,9,false);
    }

    @Override
    public void calculateThreats(Piece p, Piece[][] board) {
        for(int i=p.getLocation().getY()-1; i>=0; i--){
            Piece p2 = board[p.getLocation().getX()][i];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    board[p.getLocation().getX()][i].setPoint();
                    board[p.getLocation().getX()][i].isThreatened=true;
                }
                break;
            }
        }
        for(int i=p.getLocation().getY()+1; i<8; i++){
            Piece p2 = board[p.getLocation().getX()][i];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    board[p.getLocation().getX()][i].setPoint();
                    board[p.getLocation().getX()][i].isThreatened=true;
                }
                break;
            }
        }
        for(int i=p.getLocation().getX()+1; i<8; i++){
            Piece p2 = board[i][p.getLocation().getY()];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    board[i][p.getLocation().getY()].setPoint();
                    board[i][p.getLocation().getY()].isThreatened=true;
                }
                break;
            }
        }
        for(int i=p.getLocation().getX()-1; i>=0; i--){
            Piece p2 = board[i][p.getLocation().getY()];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
                    board[i][p.getLocation().getY()].setPoint();
                    board[i][p.getLocation().getY()].isThreatened=true;
                }
                break;
            }
        }

        //CAPRAZLAR
        int j=p.getLocation().getY()-1;
        for(int i=p.getLocation().getX()-1; i>=0; i--){
            if(j<0)
                break;
            Piece p2 = board[i][j];
            if(p2!=null){
                if(p.getColor()!=p2.getColor()){
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
                    System.out.println("girdii");
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