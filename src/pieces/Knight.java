package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Knight extends Piece {

    public Knight(Color pieceColor, Location location) {
        super(pieceColor, location, 3, false);
    }

    @Override
    public void calculateThreats(Piece p, Piece[][] board) {
        Location one = new Location(p.getLocation().getX()+1, p.getLocation().getY()-2);
        Location two = new Location(p.getLocation().getX()+2, p.getLocation().getY()-1);
        Location three = new Location(p.getLocation().getX()+2, p.getLocation().getY()+1);
        Location four = new Location(p.getLocation().getX()+1, p.getLocation().getY()+2);
        Location five = new Location(p.getLocation().getX()-1, p.getLocation().getY()+2);
        Location six = new Location(p.getLocation().getX()-2, p.getLocation().getY()+1);
        Location seven = new Location(p.getLocation().getX()-2, p.getLocation().getY()-1);
        Location eight = new Location(p.getLocation().getX()-1, p.getLocation().getY()-2);


        if(one.isLegalIndex() && board[one.getX()][one.getY()]!=null && board[one.getX()][one.getY()].getColor()!=p.getColor()){
            System.out.println("AT 11 ");
            board[one.getX()][one.getY()].setPoint();
            board[one.getX()][one.getY()].isThreatened=true;
        }
        if(two.isLegalIndex() && board[two.getX()][two.getY()]!=null && board[two.getX()][two.getY()].getColor()!=p.getColor()){
            board[two.getX()][two.getY()].setPoint();
            board[two.getX()][two.getY()].isThreatened=true;
        }
        if(three.isLegalIndex() && board[three.getX()][three.getY()]!=null && board[three.getX()][three.getY()].getColor()!=p.getColor()){
            board[three.getX()][three.getY()].setPoint();
            board[three.getX()][three.getY()].isThreatened=true;
        }
        if(four.isLegalIndex() && board[four.getX()][four.getY()]!=null && board[four.getX()][four.getY()].getColor()!=p.getColor()){
            board[four.getX()][four.getY()].setPoint();
            board[four.getX()][four.getY()].isThreatened=true;
        }
        if(five.isLegalIndex() && board[five.getX()][five.getY()]!=null && board[five.getX()][five.getY()].getColor()!=p.getColor()){
            System.out.println("AT 55 ");
            board[five.getX()][five.getY()].setPoint();
            board[five.getX()][five.getY()].isThreatened=true;
        }
        if(six.isLegalIndex() && board[six.getX()][six.getY()]!=null && board[six.getX()][six.getY()].getColor()!=p.getColor()){
            board[six.getX()][six.getY()].setPoint();
            board[six.getX()][six.getY()].isThreatened=true;
        }
        if(seven.isLegalIndex() && board[seven.getX()][seven.getY()]!=null && board[seven.getX()][seven.getY()].getColor()!=p.getColor()){
            board[seven.getX()][seven.getY()].setPoint();
            board[seven.getX()][seven.getY()].isThreatened=true;
        }
        if(eight.isLegalIndex() && board[eight.getX()][eight.getY()]!=null && board[eight.getX()][eight.getY()].getColor()!=p.getColor()){
            board[eight.getX()][eight.getY()].setPoint();
            board[eight.getX()][eight.getY()].isThreatened=true;
        }



    }

}