package org.chessco.moves.Lmove;

import org.chessco.Position;
import org.chessco.moves.Moves;

public class LmoveRightDown2 implements Moves {
    @Override
    public void move(Position position){
        position.setColumn(position.getColumn() - 1);
        position.setRow(position.getRow() + 3);
    }
}
