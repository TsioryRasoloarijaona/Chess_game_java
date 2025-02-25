package org.chessco.moves.Colums;

import org.chessco.Position;
import org.chessco.moves.Moves;

import java.io.PipedOutputStream;

public class Down implements Moves {
    @Override
    public void move (Position postion) {
        postion.setColumn(postion.getColumn() - 1);
    }
}
