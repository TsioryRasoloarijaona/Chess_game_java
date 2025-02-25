package org.chessco.moves.Row;

import org.chessco.Position;
import org.chessco.moves.Moves;

public class Right implements Moves {
    @Override
    public void move (Position position){
        position.setRow(position.getRow() + 1) ;
    }
}
