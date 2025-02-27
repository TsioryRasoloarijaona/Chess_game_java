package org.chessco.moves.Diagonals;

import org.chessco.Position;
import org.chessco.moves.Moves;

public class DmoveRightUp implements Moves {
    @Override
    public void move(Position position){
        position.setColumn(position.getColumn() + 1);
        position.setRow(position.getRow() + 1);
    }
}
