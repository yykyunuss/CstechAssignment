import pieces.Piece;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String [] strArray = new String[64];
        File file = new File("board3.txt");
        try{
            Scanner scanner = new Scanner(file);
            int index=0;
            while (scanner.hasNext()){
                //System.out.println(scanner.next());
                strArray[index++] = scanner.next();
            }
        }catch(Exception e){
            e.getMessage();
        }

        new Board(strArray);
    }
}
