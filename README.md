CHESS BOARD POINT CALCULATIONS
    -Requirement:
        - In a chess board, every piece has a point.
        - If a piece is threteaned by any enemy piece, we should decrease the piece's point to half
        - If a piece is not threteaned by any enemy piece, we do not change the point.
        - We should find total points for white and black pieces 
        
    - Main idea of the algorithm for calculation:
        1) Iterate every piece of the board
        2) According to piece type, run the calculation method
        3) Check squares that piece can move
        4) If there is any enemy piece in piece's way, set the enemy piece's point to half
        5) Do not set again that enemy piece's point
        6) Finally, add white pieces points and black pieces points
   
Technology:
    - I used Java language and Intellij IDEA editor for this project. 
    - The project is object-oriented and modular

Running
    - Program start running in main method in the Main class.
    - Program reads 3 different input files
    - Main class can be edited according to different file numbers or file names.
