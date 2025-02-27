package org.chessco;

import java.util.ArrayList;

import static java.lang.Math.min;

public class Board {
    private Square[] squares = new Square[64];

    public Board(Square[] squares){
        this.squares = squares ;
    }

    public boolean piecePresence(Square square){
        return square.getPiece() != null ;
    }

    private int availableSquaresInDirection(Square square, int columnOffset, int rowOffset) {
        int columnDistance = columnOffset > 0
                ? 8 - square.getPosition().getColumn()
                : square.getPosition().getColumn() - 1;
        int rowDistance = rowOffset > 0
                ? 8 - square.getPosition().getRow()
                : square.getPosition().getRow() - 1;

        return Math.min(columnDistance, rowDistance);
    }

    private int availableSquareLeftUp(Square square) {
        return availableSquaresInDirection(square , -1 , 1) ;
    }

    private int availableSquareRightUp(Square square) {
        return availableSquaresInDirection(square , 1 , 1) ;
    }

    private int availableSquareLeftDown(Square square) {
        return availableSquaresInDirection(square , -1 , -1) ;
    }

    private int availableSquareRightDown(Square square) {
        return availableSquaresInDirection(square , 1 , -1) ;
    }

    public ArrayList<Square> availableSquares(Square reference){

        ArrayList<Square> availableSquares = new ArrayList<>() ;
        return availableSquares ;
    }
    public void shift(Square initial , Square destination){

    }
}
