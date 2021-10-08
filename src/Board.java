import pieces.*;
import utils.Color;
import utils.Location;

public class Board {
    Piece[][] board; // Piece board
    double whitePoint = 0; // White pieces point
    double blackPoint = 0; // Black pieces point

    /**
     * Board constructor.
     */
    public Board(String[] pieceStrings) {
        initBoard(pieceStrings);
        calculatePoints();
    }

    /**
     * Initiliazes the board with pieces according to string array.
     */
    public void initBoard(String[] pieceStrings) {
        board = new Piece[8][8];
        for (int i = 0; i < pieceStrings.length; i++) {
            Location location = new Location(i % 8, i / 8);
            Piece piece;
            switch (pieceStrings[i]) {
                case "ks":
                    piece = new Rook(Color.BLACK, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "as":
                    piece = new Knight(Color.BLACK, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "fs":
                    piece = new Bishop(Color.BLACK, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "vs":
                    piece = new Queen(Color.BLACK, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "ss":
                    piece = new King(Color.BLACK, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "ps":
                    piece = new Pawn(Color.BLACK, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "kb":
                    piece = new Rook(Color.WHITE, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "ab":
                    piece = new Knight(Color.WHITE, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "fb":
                    piece = new Bishop(Color.WHITE, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "vb":
                    piece = new Queen(Color.WHITE, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "sb":
                    piece = new King(Color.WHITE, location);
                    board[i % 8][i / 8] = piece;
                    break;
                case "pb":
                    piece = new Pawn(Color.WHITE, location);
                    board[i % 8][i / 8] = piece;
                    break;
                default:
            }

        }
    }


    /**
     * Iterates the board and call "calculateThreats()" method for each piece.
     */
    public void calculatePoints() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    board[i][j].calculateThreats(board[i][j], board);
                }
            }
        }

        // Calculation of white and black pieces points
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null && board[i][j].getColor() == Color.WHITE)
                    whitePoint += board[i][j].getPoint();
                if (board[i][j] != null && board[i][j].getColor() == Color.BLACK)
                    blackPoint += board[i][j].getPoint();
            }
        }
    }
}