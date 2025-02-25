package org.chessco.moves.Lmove;

import org.chessco.Position;
import org.chessco.moves.Moves;

public class LmoveRightDown1 implements Moves {
    @Override
    public void move(Position position) {
        position.setColumn(position.getColumn() - 3);
        position.setRow(position.getRow() + 1);
    }
}
