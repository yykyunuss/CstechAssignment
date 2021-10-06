package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Knight extends Piece {

    public Knight(Color pieceColor, Location location) {
        super(pieceColor, location, 3);
    }

    @Override
    public double calculateThreats(Piece p, Piece[][] board) {
        return 0;
    }

}