package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Queen extends Piece {

    public Queen(Color pieceColor, Location location) {
        super(pieceColor, location,9);
    }

    @Override
    public double calculateThreats(Piece p, Piece[][] board) {
        return 0;
    }
}