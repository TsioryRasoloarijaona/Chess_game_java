package org.chessco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.chessco.Piece.Piece;

@AllArgsConstructor
@Setter
@Getter
public class Square {
    private Position position ;
    private Piece piece ;
    public Square(Position position) {
        this.position = position ;
        this.piece = null ;
    }
}
