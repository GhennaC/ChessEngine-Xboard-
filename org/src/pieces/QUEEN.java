package org.src.pieces;

import org.src.Move;

import java.util.ArrayList;

public class QUEEN extends Piece {

    public QUEEN(Colour colour) {
        super(colour);
    }
    
    public QUEEN(Colour colour, int i , int j) {
        super(colour,i,j);
    }
    @Override
    public boolean canMove(Piece[][] board, String move) {
        return false;
    }

    @Override
    public ArrayList<String> posiblesMoves(Piece[][] board, Piece tpiece) {
        Move t = new Move();
        return t.moveQueen(board, tpiece);
    }

    @Override
    public String getType() {
        return "org.src.pieces.QUEEN";
    }

    @Override
    public String toString() {
        return "org.src.pieces.QUEEN" + colour + " " + this.i + " " + this.j + " ";
    }
}
