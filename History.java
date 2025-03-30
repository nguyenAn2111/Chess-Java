/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamechess;

import Piece.Coordinate;
import Piece.Piece;

/**
 *
 * @author nthan
 */
public class History {
    
    private Coordinate start;
    private Coordinate target;
    private Piece chessStart;
    private Piece chessTarget;

    public Piece getChessStart() {
        return chessStart;
    }

    public void setChessStart(Piece chessStart, Coordinate _coordinate) {
        this.chessStart = chessStart;
        this.chessStart.getCoordinate().setRow(_coordinate.getRow());
        this.chessStart.getCoordinate().setCol(_coordinate.getCol());
    }

    public Piece getChessTarget() {
        return chessTarget;
    }

    public void setChessTarget(Piece chessTarger, Coordinate _coordinate) {
        this.chessTarget = chessTarger;
        this.chessTarget.getCoordinate().setRow(_coordinate.getRow());
        this.chessTarget.getCoordinate().setCol(_coordinate.getCol());
    }
    
    public Coordinate getStart() {
        return start;
    }

    public void setStart(Coordinate start) {
        this.start = start;
    }

    public Coordinate getTarget() {
        return target;
    }

    public void setTarget(Coordinate target) {
        this.target = target;
    }

    

    
    
}
