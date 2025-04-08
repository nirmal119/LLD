package com.sept2024.tictactoe.strategies.winningstrategies;

import com.sept2024.tictactoe.models.Board;
import com.sept2024.tictactoe.models.Move;
import com.sept2024.tictactoe.models.Symbol;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy{
    private HashMap<Symbol, Integer> leftDiagonal = new HashMap<>();
    private HashMap<Symbol, Integer> rightDiagonal = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

        Symbol symbol = move.getPlayer().getSymbol();

        // validation - move has to be a diagonal
        // left diagonal
        if(row == col) {
            if(!leftDiagonal.containsKey(symbol)) {
                leftDiagonal.put(symbol, 0);
            }
            leftDiagonal.put(symbol, leftDiagonal.get(symbol) + 1);

            // check if winner

            return leftDiagonal.get(symbol) == board.getDimension();
        }

        // right diagonal
        if(row + col == board.getDimension() - 1 ) {
            if(!rightDiagonal.containsKey(symbol)) {
                rightDiagonal.put(symbol, 0);
            }
            rightDiagonal.put(symbol, rightDiagonal.get(symbol) + 1);

            // check if winner
            return rightDiagonal.get(symbol) == board.getDimension();
        }

        return false;
    }
}
