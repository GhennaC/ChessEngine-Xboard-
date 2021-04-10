package org.src.pieces;

import org.src.Move;

import java.util.ArrayList;

public class KING extends Piece {

    public KING(Colour colour,int i , int j) {
        super(colour,i,j);
    }

    @Override
    public boolean canMove(Piece[][] board, String move) {
        return false;
    }

    @Override
    public ArrayList<String> posiblesMoves(Piece[][] board,Piece tpiece) {
        Move t = new Move();
        return t.moveKing(board,tpiece);
    }

    @Override
    public String getType() {
        return "org.src.pieces.KING";
    }

    @Override
    public String toString() {
        return "org.src.pieces.KING"+colour+" "+this.i+" "+this.j+" ";
    }
}
