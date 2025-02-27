package org.chessco.Piece;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.chessco.moves.Moves;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Piece {
    private PieceColors color ;
    private PieceTypes pieceTypes ;
    private ArrayList<Moves> moves ;
}
