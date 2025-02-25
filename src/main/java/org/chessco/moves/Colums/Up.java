package org.chessco.moves.Colums;

import org.chessco.Position;
import org.chessco.moves.Moves;

public class Up implements Moves {
    @Override
    public void move(Position position) {
        position.setColumn(position.getColumn() + 1);
    }
}
