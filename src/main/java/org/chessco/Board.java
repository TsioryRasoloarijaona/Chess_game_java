package org.chessco;

import java.util.ArrayList;

public class Board {
    private Square[] squares = new Square[64];

    public Board(Square[] squares){
        this.squares = squares ;
    }

    public ArrayList<Square> availableSquares(Square reference){
        ArrayList<Square> availableSquares = new ArrayList<>() ;
        return availableSquares ;
    }
    public void shift(Square initial , Square destination){

    }
}
