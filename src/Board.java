import pieces.*;
import utils.Color;
import utils.Location;

import java.util.ArrayList;
import java.util.List;

public class Board {
    //Square [] square = new Square[64];
    List<Piece> boardList = new ArrayList<>();
    List<Piece> whiteList = new ArrayList<>();
    List<Piece> blackList = new ArrayList<>();

    Piece [][] board = new Piece[8][8];

    double whitePoint=100;
    double blackPoint=100;

    public Board(String [] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if(!(strArr[i].equals("--"))){
                Location location = new Location(i%8, i/8);
                if(strArr[i].equals("ks")){
                    Piece piece = new Rook(Color.BLACK, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //blackList.add(piece);
                    blackPoint=blackPoint+5;
                }
                else if(strArr[i].equals("as")) {
                    Piece piece = new Knight(Color.BLACK, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //blackList.add(piece);
                    blackPoint=blackPoint+3;
                }
                else if(strArr[i].equals("fs")) {
                    Piece piece = new Bishop(Color.BLACK, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //blackList.add(piece);
                    blackPoint=blackPoint+3;
                }
                else if(strArr[i].equals("vs")) {
                    Piece piece = new Queen(Color.BLACK, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //blackList.add(piece);
                    blackPoint=blackPoint+9;
                }
                else if(strArr[i].equals("ss")) {
                    Piece piece = new King(Color.BLACK, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //blackList.add(piece);
                }
                else if(strArr[i].equals("ps")) {
                    Piece piece = new Pawn(Color.BLACK, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //blackList.add(piece);
                    blackPoint=blackPoint+1;
                }
                else if(strArr[i].equals("kb")) {
                    Piece piece = new Rook(Color.WHITE, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //whiteList.add(piece);
                    whitePoint=whitePoint+5;
                }
                else if(strArr[i].equals("ab")) {
                    Piece piece = new Knight(Color.WHITE, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //whiteList.add(piece);
                    whitePoint=whitePoint+3;
                }
                else if(strArr[i].equals("fb")) {
                    Piece piece = new Bishop(Color.WHITE, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //whiteList.add(piece);
                    whitePoint=whitePoint+3;
                }
                else if(strArr[i].equals("vb")) {
                    Piece piece = new Queen(Color.WHITE, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //whiteList.add(piece);
                    whitePoint=whitePoint+9;
                }
                else if(strArr[i].equals("sb")) {
                    Piece piece = new King(Color.WHITE, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //whiteList.add(piece);
                }
                else{
                    Piece piece = new Pawn(Color.WHITE, location);
                    board[i%8][i/8] = piece;
                    //boardList.add(piece);
                    //whiteList.add(piece);
                    whitePoint=whitePoint+1;
                }
            }
        }
        /*for(Piece b: boardList)
            System.out.println(b.getColor() + ", " + b.getLocation().toString());*/
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j]!=null && board[i][j].getColor()==Color.WHITE) {
                    double threatPoint = board[i][j].calculateThreats(board[i][j], board);
                    blackPoint=blackPoint-threatPoint;
                }
                else if(board[i][j]!=null && board[i][j].getColor()==Color.BLACK) {
                    double threatPoint = board[i][j].calculateThreats(board[i][j], board);
                    whitePoint=whitePoint-threatPoint;
                }
            }
        }
        /*for(Piece b: boardList){
            if(b.getColor()==Color.WHITE){
                double threatPoint = b.calculateThreats(b, blackList, board);
                blackPoint=blackPoint-threatPoint;
            }
            else{
                double threatPoint = b.calculateThreats(b, whiteList, board);
                whitePoint=whitePoint-threatPoint;
            }

        }*/
        System.out.println("white point: " + whitePoint + "\nblack point: " + blackPoint);
    }
}
