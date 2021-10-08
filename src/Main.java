import io.FileReadWrite;

import java.io.IOException;

import static io.FileReadWrite.*;

/**
 * @author Yahya Yunus Kucuk
 * @since 2021-08-10
 */

public class Main {
    static String fileName1 = "board1.txt";
    static String fileName2 = "board2.txt";
    static String fileName3 = "board3.txt";

    /**
     * First, we read file. Then open chess board and run the algorithm for point calculation.
     * Then we write the results to output file
     */
    public static void main(String[] args) throws Exception {
        String[] pieceStrings = new String[64]; // string array for file input

        readFile(pieceStrings, fileName1);
        Board board1 = new Board(pieceStrings);
        writeHeader();
        writeResults(fileName1, board1.whitePoint, board1.blackPoint);

        readFile(pieceStrings, fileName2);
        Board board2 = new Board(pieceStrings);
        writeResults(fileName2, board2.whitePoint, board2.blackPoint);

        readFile(pieceStrings, fileName3);
        Board board3 = new Board(pieceStrings);
        writeResults(fileName3, board3.whitePoint, board3.blackPoint);
    }
}
